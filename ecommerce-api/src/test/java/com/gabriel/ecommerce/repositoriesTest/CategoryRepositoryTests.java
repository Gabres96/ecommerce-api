package com.gabriel.ecommerce.repositoriesTest;

import com.gabriel.ecommerce.entities.Category;
import com.gabriel.ecommerce.repositories.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class CategoryRepositoryTests {

    @Autowired
    private CategoryRepository repository;

    private Long existingId;
    private Long nonExistingId;

    @BeforeEach
    void setUp() {
        nonExistingId = 99L;

        Category cat = new Category(null, "Eletrônicos");
        cat = repository.save(cat);

        existingId = cat.getId();
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull() {
        Category category = new Category(null, "Livros");

        category = repository.save(category);

        Assertions.assertNotNull(category.getId());
        Assertions.assertTrue(category.getId() > existingId);
    }

    @Test
    public void findByIdShouldReturnNonEmptyOptionalWhenIdExists() {
        Optional<Category> result = repository.findById(existingId);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals("Eletrônicos", result.get().getName());
    }

    @Test
    public void findByIdShouldReturnEmptyOptionalWhenIdDoesNotExist() {
        Optional<Category> result = repository.findById(nonExistingId);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists() {
        repository.deleteById(existingId);

        Optional<Category> result = repository.findById(existingId);

        Assertions.assertFalse(result.isPresent());
    }
}
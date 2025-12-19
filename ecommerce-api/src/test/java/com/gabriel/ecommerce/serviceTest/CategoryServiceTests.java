package com.gabriel.ecommerce.serviceTest;

import com.gabriel.ecommerce.entities.Category;
import com.gabriel.ecommerce.repositories.CategoryRepository;
import com.gabriel.ecommerce.services.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
public class CategoryServiceTests {

    @InjectMocks
    private CategoryService service;

    @Mock
    private CategoryRepository repository;

    private Category category;

    @BeforeEach
    void setUp() throws Exception {

        category = new Category(1L, "Eletrônicos");

        Mockito.when(repository.findAll()).thenReturn(List.of(category));
    }

    @Test
    public void findAllShouldReturnList() {

        List<Category> result = service.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("Eletrônicos", result.get(0).getName());

        Mockito.verify(repository, Mockito.times(1)).findAll();
    }
}
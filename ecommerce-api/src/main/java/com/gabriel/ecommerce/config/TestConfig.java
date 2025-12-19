package com.gabriel.ecommerce.config;

import com.gabriel.ecommerce.entities.Category;
import com.gabriel.ecommerce.entities.Product;
import com.gabriel.ecommerce.repositories.CategoryRepository;
import com.gabriel.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Eletrônicos");
        Category cat2 = new Category(null, "Livros");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2));

        Product p1 = new Product(null, "The Lord of the Rings", "Best seller book", 90.5, "", cat2);
        Product p2 = new Product(null, "Smart TV", "4K Ultra HD", 2190.0, "", cat1);

        productRepository.saveAll(Arrays.asList(p1, p2));

        System.out.println("Banco de dados populado com sucesso!");
    }
}
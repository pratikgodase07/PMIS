package com.prac.question1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = List.of(
            new Product(1, "Keyboard", 49.99),
            new Product(2, "Mouse", 19.99)
    );

    public List<Product> findAll() {
        return products;
    }
}

package com.prac.question2;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class ProductService {

    private final Map<Long, Product> products = Map.of(
            1L, new Product(1, "Keyboard", 49.99),
            2L, new Product(2, "Mouse", 19.99)
    );

    public Optional<Product> findById(long id) {
        return Optional.ofNullable(products.get(id));
    }
}

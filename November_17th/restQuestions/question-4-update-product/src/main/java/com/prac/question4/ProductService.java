package com.prac.question4;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class ProductService {

    private final Map<Long, Product> products = new HashMap<>(Map.of(
            1L, new Product(1, "Keyboard", 49.99),
            2L, new Product(2, "Mouse", 19.99)
    ));

    public Optional<Product> update(long id, UpdateProductRequest request) {
        if (!products.containsKey(id)) {
            return Optional.empty();
        }
        Product updated = new Product(id, request.name(), request.price());
        products.put(id, updated);
        return Optional.of(updated);
    }
}

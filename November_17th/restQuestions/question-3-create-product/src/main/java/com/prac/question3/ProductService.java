package com.prac.question3;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {

    private final AtomicLong nextId = new AtomicLong(3);

    public Product create(CreateProductRequest request) {
        return new Product(nextId.getAndIncrement(), request.name(), request.price());
    }
}

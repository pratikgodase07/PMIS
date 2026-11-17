package com.prac.question5;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ProductService {

    private final Set<Long> productIds = new HashSet<>(Set.of(1L, 2L));

    public boolean deleteById(long id) {
        return productIds.remove(id);
    }
}

# Solution 4 - Update a product

## Files involved

Complete:

```text
question-4-update-product/
└── src/main/java/com/prac/question4/ProductController.java
```

The service already checks whether the id exists, creates the updated product, stores it, and returns an `Optional`. The controller translates that result into either `200 OK` or `404 Not Found`.

## Completed controller

```java
package com.prac.question4;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable long id,
            @RequestBody UpdateProductRequest request) {
        return productService.update(id, request)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
```

The id comes from the URL and the new values come from the JSON body. The id is not taken from the body, which prevents the request from accidentally changing the resource identity.

## Postman tests

Existing product:

```text
PUT http://localhost:8080/api/products/1
```

Use **Body > raw > JSON**:

```json
{
  "name": "Mechanical Keyboard",
  "price": 89.99
}
```

Expected status: `200 OK`

```json
{
  "id": 1,
  "name": "Mechanical Keyboard",
  "price": 89.99
}
```

Missing product:

```text
PUT http://localhost:8080/api/products/99
```

Use any valid JSON body. Expected status: `404 Not Found`.

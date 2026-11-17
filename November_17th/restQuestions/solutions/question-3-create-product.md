# Solution 3 - Create a product

## Files involved

Complete:

```text
question-3-create-product/
└── src/main/java/com/prac/question3/ProductController.java
```

The supplied `CreateProductRequest` contains only `name` and `price`. The service creates the id, so the controller must pass the request to `ProductService.create()` and return the resulting product.

## Completed controller

```java
package com.prac.question3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody CreateProductRequest request) {
        Product createdProduct = productService.create(request);
        return ResponseEntity.status(201).body(createdProduct);
    }
}
```

`@RequestBody` tells Spring to deserialize the JSON request into `CreateProductRequest`. `ResponseEntity.status(201).body(...)` explicitly returns the REST-standard `201 Created` response and the newly created product.

## Postman test

Start `Question3Application`, then create:

```text
POST http://localhost:8080/api/products
```

In Postman select **Body > raw > JSON** and send:

```json
{
  "name": "Monitor",
  "price": 199.99
}
```

Expected status: `201 Created`

Expected response:

```json
{
  "id": 3,
  "name": "Monitor",
  "price": 199.99
}
```

Postman normally adds `Content-Type: application/json` when JSON is selected. If it does not, add that header manually.

# Solution 1 - Get all products

## Files involved

The candidate only needs to complete:

```text
question-1-get-all-products/
└── src/main/java/com/prac/question1/ProductController.java
```

`Product.java`, `ProductService.java`, and `Question1Application.java` are already provided as boilerplate.

## Completed controller

Open `src/main/java/com/prac/question1/ProductController.java`. The controller receives a `ProductService` through its constructor. The `@GetMapping` annotation maps `GET /api/products` to `getProducts()`. The service already owns the in-memory product list, so the controller should delegate to `findAll()` and return its result.

```java
package com.prac.question1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.findAll();
    }
}
```

Returning a `List<Product>` lets Spring MVC serialize the list into a JSON array. The HTTP response is `200 OK` by default.

## Postman test

Start `Question1Application`, then create this request:

```text
GET http://localhost:8080/api/products
```

Expected status: `200 OK`

Expected response:

```json
[
  {
    "id": 1,
    "name": "Keyboard",
    "price": 49.99
  },
  {
    "id": 2,
    "name": "Mouse",
    "price": 19.99
  }
]
```

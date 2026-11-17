# Solution 2 - Get a product by id

## Files involved

Complete this file:

```text
question-2-get-product-by-id/
└── src/main/java/com/prac/question2/ProductController.java
```

`ProductService.findById(long id)` returns an `Optional<Product>`. An `Optional` represents either a matching product or no value, which makes the two required HTTP outcomes explicit.

## Completed controller

```java
package com.prac.question2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable long id) {
        return productService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
```

`@PathVariable` converts the numeric URL segment into the `long id` parameter. `ResponseEntity.ok(product)` produces `200 OK` with JSON. If the `Optional` is empty, `ResponseEntity.notFound()` produces `404 Not Found` with no body.

## Postman tests

Existing product:

```text
GET http://localhost:8080/api/products/1
```

Expected status: `200 OK`

```json
{
  "id": 1,
  "name": "Keyboard",
  "price": 49.99
}
```

Missing product:

```text
GET http://localhost:8080/api/products/99
```

Expected status: `404 Not Found`.


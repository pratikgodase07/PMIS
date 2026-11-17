# Solution 5 - Delete a product

## Files involved

Complete:

```text
question-5-delete-product/
└── src/main/java/com/prac/question5/ProductController.java
```

`ProductService.deleteById()` returns `true` when an id was removed and `false` when it was not present. The controller uses that boolean to choose the response status.

## Completed controller

```java
package com.prac.question5;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
        if (productService.deleteById(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
```

`ResponseEntity.noContent()` returns `204 No Content`, which correctly has no response body. A second delete of the same id returns `404 Not Found` because the product is no longer in the in-memory set.

## Postman tests

Existing product:

```text
DELETE http://localhost:8080/api/products/1
```

Expected status: `204 No Content` and an empty response body.

Missing product:

```text
DELETE http://localhost:8080/api/products/99
```

Expected status: `404 Not Found`.

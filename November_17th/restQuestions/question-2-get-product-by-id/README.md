# Question 2 - Get a product by id

## Task

Create a `GET /api/products/{id}` endpoint. Return the matching product with `200 OK`. If the id is not present, return `404 Not Found` with an empty response body.

Complete the method marked `TODO` in `ProductController.java`. Use the supplied in-memory service.

## Examples

- `GET /api/products/1` returns `200 OK` and `{"id":1,"name":"Keyboard","price":49.99}`.
- `GET /api/products/99` returns `404 Not Found`.

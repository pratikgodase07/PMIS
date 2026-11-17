# Question 5 - Delete a product

## Task

Create a `DELETE /api/products/{id}` endpoint. Delete the product when the id exists and return `204 No Content`. Return `404 Not Found` when the id does not exist.

Complete the method marked `TODO` in `ProductController.java`. The service already contains the in-memory delete operation.

## Examples

- `DELETE /api/products/1` returns `204 No Content`.
- `DELETE /api/products/99` returns `404 Not Found`.

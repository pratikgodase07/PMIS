# Question 4 - Update a product

## Task

Create a `PUT /api/products/{id}` endpoint. Update the product when the id exists and return the updated product with `200 OK`. Return `404 Not Found` when the id does not exist.

Complete the method marked `TODO` in `ProductController.java`.

## Example

`PUT /api/products/1` with `{"name":"Mechanical Keyboard","price":89.99}` returns `200 OK` and the updated product.

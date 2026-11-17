# Question 3 - Create a product

## Task

Create a `POST /api/products` endpoint that accepts a JSON product name and price, creates the next product id, and returns the created product with `201 Created`.

The request does not contain an id. Complete the method marked `TODO` in `ProductController.java`.

## Example

Request:

```http
POST /api/products
Content-Type: application/json
```

```json
{"name":"Monitor","price":199.99}
```

Response: `201 Created`

```json
{"id":3,"name":"Monitor","price":199.99}
```

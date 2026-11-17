# Question 1 - Get all products

## Task

Create a `GET /api/products` endpoint. It must return every product held by the in-memory service as a JSON array with HTTP `200 OK`.

Do not add a database or change the endpoint path. Complete the method marked `TODO` in `ProductController.java`.

## Expected response

`GET /api/products`

```json
[
  {"id": 1, "name": "Keyboard", "price": 49.99},
  {"id": 2, "name": "Mouse", "price": 19.99}
]
```

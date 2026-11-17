# Spring REST API Placement Questions

The five folders in this directory are independent, easy-level Spring REST API exercises. Open one question folder at a time and read its `README.md`. The files under `src/main/java` are the candidate starter files; implement the methods marked `TODO`.

Each question focuses on one REST operation and uses an in-memory service so no database setup is required:

1. `question-1-get-all-products` - return all products
2. `question-2-get-product-by-id` - return one product or `404 Not Found`
3. `question-3-create-product` - create a product from JSON
4. `question-4-update-product` - update a product with `PUT`
5. `question-5-delete-product` - delete a product and return the correct status
6. `question-6-search-books` - search books with repository, service, controller, and exception handling and return the correct status

The existing root `pom.xml` supplies the Spring Boot and test dependencies. The folders intentionally keep their own package names and starter code so that a question can be copied into a standalone Maven exercise without rewriting the prompt.

Completed implementations and Postman walkthroughs are available in the [`solutions`](solutions) folder.

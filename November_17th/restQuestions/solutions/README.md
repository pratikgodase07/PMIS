# Solutions

These solution guides contain the completed code for all five REST API questions. They are intended for the test creator or for review after a candidate has attempted a question.

## Running a question with Postman

Each question is an independent Spring Boot exercise. To run one:

1. Copy the selected question's `src` directory into a standalone Maven project containing the supplied root `pom.xml`.
2. Run the application class shown in that question's solution guide.
3. In Postman, send requests to `http://localhost:8080`.
4. Select the HTTP method shown in the guide and enter the request URL.
5. For `POST` and `PUT`, choose **Body > raw > JSON** and use the request JSON shown in the guide.

The completed solution is deliberately limited to the method marked `TODO` in each question. The other starter files are already correct and should not be changed.

## Guides

- [Question 1 - Get all products](question-1-get-all-products.md)
- [Question 2 - Get a product by id](question-2-get-product-by-id.md)
- [Question 3 - Create a product](question-3-create-product.md)
- [Question 4 - Update a product](question-4-update-product.md)
- [Question 5 - Delete a product](question-5-delete-product.md)
- [Question 6 - Search books with layers and error handling](question-6-search-books.md)

# 6 - JAX-RS Notes

A very brief introduction to some of the Java EE concepts used within Avaloq.



## 1 - List all books
- GET \<collection\>

- review PostMan

- URL (`/rest/books`).  Why `rest` (`@ApplicaionPath`) and why `books` (`@Path`)

- `@Consumes` and `@Produces`

- review `BookController#findAll()`, returning a collection of Book.

- examine the `Accept` HTTP header param.

  ​

## 2 - Create a book
- POST \<resource\>

- examine the request body.

- examine the `Accept` HTTP header param, noting that it's JSON in this case.

- examine the JSON response.

- review `BookController#create()`

- change the `Accept` HTTP header param to `application\xml` and note response.

- examine the `javax.xml.bin.annotation` on `Book` and `Author`.

  ​

## 3 - Get a book
- GET \<resource\>

- examine the URL which includes the ID as `/books/id`

- review `BookController#find()`

- focus on the `@Path("/{id}")` which differentiate from finaAll when routing the request (both are GET).

- focus on the `@PathParam`.

  ​

## 4 - Update a book
- PUT \<resource\>

- examine the request body

- examine the response (which is the mirror of the result from the creation).

- review `BookController#update()`.

  ​

## 5 - Delete a book
- DELETE \<resource\>
- examine the URL which includes the ID as s `/books/id=foo`
- note this is different to the find a book (path param vs query param).
- run find all books again to reiterate the point.
- review `BookController#remove()`
- focus on `@PathParam` vs `@QueryParam`.

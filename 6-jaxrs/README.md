# (4) JAX-RS Notes

A brief (one day) course on some basics of Java EE.

## 1 - (HTTP GET) Find All Books
- review `BookController#findAll()`

## 2 - (HTTP POST) Create Book 
- examine the request body
- examine the response (which is the mirror of the result from the creation).
- review `BookController#create()`

## 3 - (HTTP GET) Find a Book
- examine the URL which includes the ID as s `.../books/id`
- review `BookController#find()`
- focus on the `@Path("/{id}")` which differentiate from finaAll when routing the request
- focus on the `@PathParam`

## 4 - (HTTP PUT) Update Book
- examine the request body
- examine the response (which is the mirror of the result from the creation).
- review `BookController#update()`

## 5 - (HTTP DELETE) Delete Book
- examine the URL which includes the ID as s `.../books/id=foo`
- note this is different to the find a book (path param vs query param)
- run find all books again to reiterate the point.
- review `BookController#remove()`
- focus on the `@QueryParam`

# (3) EJB Notes

A brief (one day) course on some basics of Java EE.

## 1. Demo Foobar
Walk thought the structure of the project, paying attention to:
- JPA Entities
- `persistence.xml`, including the `jta-datatsoure` (show in `standalone.xml` and the JBoss Admin Console)
- `BookEJB`, including the `@Stateless` and `@LocalBean` annotations.
- `BookController` which is referecnging `BookEJB` via the local view.

In Postman 
- Find books
- Create book
- Update book
- Delete book

## 2. Demo @Singleton
In `BookEJB` comment in the lines relating to `OperationCache`.

In Postman 
- Find books
- Create book
- Update book
- Delete book

## 3. Demo @Asynchronous
In `BookEJB` comment in the lines relating to `Notifier`.

In Postman 
- Find books
- Create book

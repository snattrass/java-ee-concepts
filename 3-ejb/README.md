# 3 - EJB Notes

A very brief introduction to some of the Java EE concepts used within Avaloq.



## 1. Demo `BookEJB`
Walk thought the structure of the project, paying attention to:
- JPA Entities
- `persistence.xml`, including the `jta-datatsoure` (show in `standalone.xml` and the JBoss Admin Console)
- `BookEJB`, including the `@Stateless` and `@LocalBean` annotations and how we implement `BookEJBRemote`.
- Examine `BookEJBRemote` and it's use of the `@Remote` annotation.
- Examine `BookController` which is referencing `BookEJB` via the local view and <u>not</u> the `BookEJBRemote` interface (the remote view).



In Postman 

- Find books

- Create book

- Update book

- Delete book

  ​

## 2. Demo @Singleton
In `BookEJB` *comment in* the lines relating to `OperationCache`.



In Postman

- Find books
- Create book
- Update book
- Delete book

... examining the output in the log.



## 3. Demo @Asynchronous
In `BookEJB` *comment in* the lines relating to `Notifier`.



In Postman

- Find books
- Create book

... examining the output in the log.
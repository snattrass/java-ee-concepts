# 3 - EJB Notes

A very brief introduction to some of the Java EE concepts used within Avaloq.



## 1. Demo `BookEJB`
Walk thought the structure of the project, paying attention to:
- Breifly cover the JPA Entities used.
- Examine `persistence.xml`, including the `jta-datatsoure` (show in `standalone.xml` and the JBoss Admin Console, *Runtime -> Standalone Server -> Subsystems -> Datasources*).
- Examine `BookEJB`, including the `@Stateless` and `@LocalBean` annotations and how we implement `BookEJBRemote`.
- Examine `BookEJBRemote` and it's use of the `@Remote` annotation.
- Examine `BookController` which is referencing `BookEJB` via the local view and <u>not</u> the `BookEJBRemote` interface (the remote view).



In Postman 

- Find books

- Create book

- Update book

  ​


## 2. Demo `@Singleton`
* In `BookEJB` *comment in* the lines relating to `OperationCache`.
* Examine `OperationCache`, rebuild and redeploy.



In Postman

- Find books
- Create book

- Update book

  ​

... examining the output in the log showing the cache entries being updated.

* Raise the issue of concurrency and the singleton.  What happens if multiple requests come in to update the cache?  What will happen?



## 3. Demo `@Asynchronous`
* In `BookEJB` *comment in* the lines relating to `Notifier`.


* Examine `Notifier`, rebuild and redeploy.



In Postman

- Find books
- Create book, examining the output in the log for the email notification. 

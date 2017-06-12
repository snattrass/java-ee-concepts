# 2 - JPA (in the Container) Notes

A very brief introduction to some of the Java EE concepts used within Avaloq.



*Startup JBoss again.*



### 1. Walk-through Entities

* Examine `Author` and `Genre`.
* Examine`Person` which Author now inherits from as a `@MappedSuperclass` and it's own `@Embedded Address`.
* Examine `AppStartup` for the various query methods.
* Examine  `persistence.xml` including the `jta-datatsoure` (show in `standalone.xml` and the JBoss Admin Console, *Runtime -> Standalone Server -> Subsystems -> Datasources*).

- Examine `insert.sql` and how it fits into `persistence.xml`.
- Examine `Main`, how we're getting a reference to the `EntityManagerFactory`, `EntityManager` and transactions.
- Deploy `h2console.war` and examine the schema via H2 Browser `http://localhost:8080/h2concole`, note the `JDBC URL` which can be determined from the datasource in `standalone.xml`.

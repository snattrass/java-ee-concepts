# 5 - JAX-WS Client Notes

A very brief introduction to some of the Java EE concepts used within Avaloq.



## 1 - Walk-though Client and demo
- Examine `Main.java` highlighting the simplicity of the code, yet how there are linking problems (due to a missing dependency).
- Examine `pom.xml` paying attention to the `wsimport` step which imports `CardValidator?wsdl`.
- Run build, show the build output (wsimport step) and re-examine `Main.java`, which now should have no liking issues.
- Run.


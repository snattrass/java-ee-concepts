# (1) CDI Notes

A brief (one day) course on some basics of Java EE.

- **Demo Injection**
Deploy the war as is and view the output.

- **Demo Interceptors**
Comment out `AppStartupDemoInjector` and comment back in `AppStartupDemoInterceptor` and run, checking the output.

- **Demo Scoping**

Restart or redploy the JBoss to clean the log and navigate to `http://localhost:8080/javaee-concepts-cdi/rest/scope/application` and then 
`http://localhost:8080/javaee-concepts-cdi/rest/scope/request`.  Observe the output, comment later on the number of 
calls to the constructor.

# 1 - CDI Notes

A very brief introduction to some of the Java EE concepts used within Avaloq.



## 1. Injection
* Deploy the war as is and view the output.

* Explore `AppStartupDemoInjection` , the `@Inject` of `GreetingService` which injects the `@Greeting` interface.

* Explains `@Startup`, `@Singleton` and `@PostConstruct`.

  ​

##  2. Qualifiers

- Examine the `@Deutsche` qualifier.

- *Comment out* the `@Deutsche` qualifier on `DeutcheGreeting`, rebuild and redeploy.  Note the deployment failure `Ambiguous Dependencies`.

- Comment `@Deutche` *back in* on `DeutscheGreeting` and comment the qualifer in on the `GreetingService`.

- Deploy the war as is and view the output.

  ​

## 3. Interceptors
* Examine `AppStartupDemoInterceptor` noting the `GreetingServiceWithInterceptor`.
* Examine `@Interceptor` and the `BeforeAndAfterLoggingInterceptor` which is on a method.
* In the `BeforeAndAfterLoggingInterceptor` note the `@AroundInvoke` and the `context`.
* Comment out `AppStartupDemoInjector` and comment back in `AppStartupDemoInterceptor` rebuild, reploy and view the output.



## 4. Interceptor Chaining

- Examine `SecurityInterceptor` noting the `GreetingServiceWithInterceptor`.

- Alter `GreetingServiceWithInterceptor` to chain the `SecurityInterceptor` first.

  ``@Interceptor({SecurityInterceptor.class, BeforeAndAfterLoggingInterceptor.class})``.

- Rebuild, reploy and view the output.



## 5. Bean Lifecycle

- Examine `AppStartupDemoLifecycle` noting the `LifecycleBean`.

- Examine `@PostConstruct` and `@Predestroy`.

- Deploy and note outout.

- Disable and not output.

- Enable and note output.

- Shutdown JBoss via `Ctrl-C` and note output.

  ​

## 6. Scope

* Comment out all the Startup beans.

* Comment in `ScopeController`, noting that this bean injects both `RequestScopedBean` and `ApplicationScopedBean`.

* Examine `RequestScopedBean` and note `@RequestScoped`.

* Examine `ApplicationScopedBean` and note `@ApplicationScoped`.

* Rebuild and redeploy.

* Navigate to `http://localhost:8080/javaee-concepts-cdi/rest/scope/application` and then observe the output.  Repeat multiple times.

* Navigate to `http://localhost:8080/javaee-concepts-cdi/rest/scope/request`and observe the output again repeating multiple times.

* Comment on *number of calls to the constructor*.

* Pose question 

  > *What is the difference between* `@ApplicationScoped` *and* `@Singleton`*?*
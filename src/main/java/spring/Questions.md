1) What is @EnableAutoConfiguration
    It is use to enable auto configuration in spring boot application
    @EnableAutoConfiguration in spring boot tells how you want to configure spring, based on the jars that you have added in your classpath. For example, if you add spring-boot-starter-web dependency in your classpath, it automatically configures Tomcat and Spring MVC.

2) What is spring-boot-dev tools?

    Applications that use spring boot dev tools will automatically restart whenever files on the classpath changes
    
3) What are profiles in spring boot?

    Spring profiles provide a way to segregate parts of your application configuration and make it only available in certain environments. Any @Component or @Configuration can be marked with @Profile to limit when it is loaded.
    
4) Spring boot actuator 

    Spring boot actuator helps you monitor and manage your application health when you push it to production
    
5) How to disable specific auto-configuration in spring

    @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

 6) Live Reload -> For browser refresh whenever resource is changed
 
 7) Hot swapping -> Reloading the changes without restarting the server 
 
 8) Spring vs Spring Boot
    Starter dependencies
    AutoConfiguration
    Spring initializer
    Spring Actuator
    Spring CLI
    
 7) Embedded Container vs WAR
 
    Embedded Container is that you can use spring boot application as a JAR without setting up web server
    with war file we will have to set up web server
    
 8) Control debugging 
    logging.level.org.springframework = DEBUG
    
 9) What is spring boot
    Spring Boot is an open source Java-based framework used to build stand-alone and production ready spring applications.
    
 10) @RestController -> @Controller and @ResponseBody
 
 11) @ResponseBody -> To return objects in form of xml or json
 
 12) Spring Boot Version -> 2.3.2
 
 13) Why spring is opinionated?
 
    Spring Boot just decides on a set of default configured beans which you can override if you want.
    
    For example if you include the spring boot starter pom for jpa, you'll get autoconfigured for you an in memory database, a hibernate entity manager, and a simple datasource. This is an example of an opinionated (Spring's opinion that it's a good starting point) default configuration that you can override.
    
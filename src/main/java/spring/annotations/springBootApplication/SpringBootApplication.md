Enable auto-configuration of the Spring Application Context, attempting to guess and configure beans that you are likely to need. Auto-configuration classes are usually applied based on your classpath and what beans you have defined.

@EnableAutoConfiguration in spring boot tells how you want to configure spring, based on the jars that you have added in your classpath. For example, if you add spring-boot-starter-web dependency in your classpath, it automatically configures Tomcat and Spring MVC.

````
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
````

You can use @EnableAutoConfiguration annotation along with @Configuration annotation. It has two optional elements,

exclude : if you want to exclude the auto-configuration of a class.
excludeName : if you want to exclude the auto-configuration of a class using fully qualified name of class.
Examples:

````
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
  public class MyConfiguration {
}
````

````
@EnableAutoConfiguration(excludeName = {"org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
````


````
All auto configuration logic is implemented in spring-boot-autoconfigure.jar. 
All auto configuration logic for mvc, data, jms and other frameworks is present in a single jar.
````

@SpringBootApplication is a newer version of @EnableAutoConfiguration which was introduced in Spring Boot 1.2.

@SpringBootApplication is a combination of three annotations,

@Configuration - for java based configuration classes.

@ComponentScan - to enable component scanning, all the packages and subpackages will be auto-scanned which are under the root package on which @SpringBootApplication is applied.

@EnableAutoConfiguration - to enable auto-configuration of the
classes bases on the jars added in classpath.

@ComponentScan enables component scanning so that web controller classes and other components that you create will be automatically discovered and registered as beans in spring's application context. You can specify the base packages that will be scanned for auto-discovering and registering of beans.

One of the optional element is,

basePackages - can be used to state specific packages to scan.
Example,

````
@ComponentScan(basePackages = {"com.example.test"})
@Configuration
public class SpringConfiguration { }
````

````
@ComponentScan({"com.in28minutes.springboot.basics.springbootin10steps","com.in28minutes.springboot.somethingelse"})
@SpringBootApplication
public class SpringbootIn10StepsApplication {
````



Use @Configuration annotation on top of any class to declare that this class provides one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
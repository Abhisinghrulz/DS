**@Required**

This annotation is applied on bean setter methods. Consider a scenario where you need to enforce a required property. The @Required annotation indicates that the affected bean must be populated at configuration time with the required property. Otherwise an exception of type BeanInitializationException is thrown.

**@Autowired**

This annotation is applied on fields, setter methods, and constructors. The @Autowired annotation injects object dependency implicitly.

When you use @Autowired on fields and pass the values for the fields using the property name, Spring will automatically assign the fields with the passed values.

You can even use @Autowired on private properties, as shown below. (This is a very poor practice though!)

````
public class Customer {
    @Autowired                               
    private Person person;                   
    private int type;
}
````

When you use @Autowired on setter methods, Spring tries to perform the by Type autowiring on the method. You are instructing Spring that it should initiate this property using setter method where you can add your custom code, like initializing any other property with this property.

````
public class Customer {                                                                                         
    private Person person;
    @Autowired                                                                                                      
    public void setPerson (Person person) {
     this.person=person;
    }
}
````
Consider a scenario where you need instance of class A, but you do not store A in the field of the class. You just use A to obtain instance of B, and you are storing B in this field. In this case setter method autowiring will better suite you. You will not have class level unused fields.

When you use @Autowired on a constructor, constructor injection happens at the time of object creation. It indicates the constructor to autowire when used as a bean. One thing to note here is that only one constructor of any bean class can carry the @Autowired annotation.

````
@Component
public class Customer {
    private Person person;
    @Autowired
    public Customer (Person person) {          
      this.person=person;
    }
}
````
NOTE: As of Spring 4.3, @Autowired became optional on classes with a single constructor. In the above example, Spring would still inject an instance of the Person class if you omitted the @Autowired annotation

**@Configuration**

This annotation is used on classes which define beans. @Configuration is an analog for XML configuration file – it is configuration using Java class. Java class annotated with @Configuration is a configuration by itself and will have methods to instantiate and configure the dependencies.

````
@Configuration
public class DataConfig{ 
  @Bean
  public DataSource source(){
    DataSource source = new OracleDataSource();
    source.setURL();
    source.setUser();
    return source;
  }
  @Bean
  public PlatformTransactionManager manager(){
    PlatformTransactionManager manager = new BasicDataSourceTransactionManager();
    manager.setDataSource(source());
    return manager;
  }
}
````

**@Value**

````
@Value("${groupName}")
public String groupName;

application.properties
groupName = group1

if value is not present -> BeanCreationException

@Value("${groupName:defaultGroupName}")
public String groupName;

````

@**ComponentScan**

This annotation is used with @Configuration annotation to allow Spring to know the packages to scan for annotated components. @ComponentScan is also used to specify base packages using basePackageClasses
 or basePackage attributes to scan. If specific packages are not defined, scanning will occur from the package of the class that declares this annotation.
 
 **@Bean**
 
 This annotation is used at the method level. @Bean annotation works with @Configuration to create Spring beans. As mentioned earlier, @Configuration will have methods to instantiate and configure dependencies. Such methods will be annotated with @Bean. The method annotated with this annotation works as bean ID and it creates and returns the actual bean.
 
 Here is an example:
 
 ````
 @Configuration
 public class AppConfig{
   @Bean
   public Person person(){
     return new Person(address());
   }
   @Bean
   public Address address(){
     return new Address();
   }
 }
````

**@Lazy**

This annotation is used on component classes. By default all autowired dependencies are created and configured at startup. But if you want to initialize a bean lazily, you can use @Lazy annotation over the class. This means that the bean will be created and initialized only when it is first requested for. You can also use this annotation on @Configuration classes. This indicates that all @Bean methods within that @Configuration should be lazily initialized.


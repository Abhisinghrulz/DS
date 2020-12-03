**Functional Interface :**

The term Java functional interface was introduced in Java 8. A functional interface in Java is an interface that contains only a single abstract (unimplemented) method. A functional interface can contain default and static methods which do have an implementation, in addition to the single unimplemented method.

Here is a Java functional interface example:

```
public interface MyFunctionalInterface {
    public void execute();
}
```

**Predicate**

The Java Predicate interface, java.util.function.Predicate, represents a simple function that takes a single value as parameter, and returns true or false. Here is how the Predicate functional interface definition looks:

```
public interface Predicate {
    boolean test(T t);
}
```

The Predicate interface contains more methods than the test() method, but the rest of the methods are default or static methods which you don't have to implement.

You can implement the Predicate interface using a class, like this:

````
public class CheckForNull implements Predicate {
    @Override
    public boolean test(Object o) {
        return o != null;
    }
}
````
You can also implement the Java Predicate interface using a Lambda expression. Here is an example of implementing the Predicate interface using a Java lambda ex

**Consumer**

The Java Consumer interface is a functional interface that represents an function that consumes a value without returning any value. A Java Consumer implementation could be printing out a value, or writing it to a file, or over the network etc. Here is an example implementation of the Java Consumer interface:

Consumer<Integer> consumer = (value) -> System.out.println(value);


Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result


A Stream in java can be defined as a sequence of elements from a source that supports aggregate operations on them.
The source here refers to a Collections or Arrays who provide data to a stream.


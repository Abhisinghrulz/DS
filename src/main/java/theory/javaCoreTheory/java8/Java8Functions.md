https://www.softwaretestinghelp.com/java-8-interview-questions/

**FUNCTION**
```
@FunctionalInterface
public interface Function<T, R> {
      R apply(T t);
}
```

```
import java.util.function.Function;
public class JavaMoney {
    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();
        Integer apply = func.apply("mkyong");   // 6
        System.out.println(apply);
    }
}
```

**CONSUMER**

````
@FunctionalInterface
public interface Consumer<T> {
  void accept(T t);
}
````

````
import java.util.function.Consumer;
public class Java8Consumer1 {
    public static void main(String[] args) {
        Consumer<String> print = x -> System.out.println(x);
        print.accept("java");   // java
    }
}
````

**SUPPLIER**

````
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
````

````
public class Java8Supplier1 {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();
        System.out.println(time);
    }
}
````

**PREDICATE**

````
@FunctionalInterface
public interface Predicate<T> {
  boolean test(T t);
}
````

````
public class Java8Predicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(collect); // [6, 7, 8, 9, 10]
    }
}
````

**BIFUNCTION**

````
@FunctionalInterface
public interface BiFunction<T, U, R> {
      R apply(T t, U u);
}
````

````
public class Java8BiFunction1 {
    public static void main(String[] args) {
        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(2, 3);
        System.out.println(result); // 5
        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);
        Double result2 = func2.apply(2, 4);
        System.out.println(result2);    // 16.0
        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
        List<Integer> result3 = func3.apply(2, 3);
        System.out.println(result3);
    }
}
````


FunctionalInterface -> Only one unimplemented abstract method
Optional -> To avoid null pointer exception
A method that is defined as Lambda Expression can be passed as a parameter to another method.


Q #13) Is there anything wrong with the following code? Will it compile or give any specific error?

````
@FunctionalInterface
public interface Test<A, B, C> {
public C apply(A a, B b);
    default void printString() {
        System.out.println("softwaretestinghelp");
    }
}
````

Answer: Yes. The code will compile because it follows the functional interface specification of defining only a single abstract method. The second method, printString(), is a default method that does not count as an abstract method.

Q #18) Write a program to print 5 random numbers using forEach in Java 8?

Answer: The below program generates 5 random numbers with the help of forEach in Java 8. You can set the limit variable to any number depending on how many random numbers you want to generate.

````
import java.util.Random;

class Java8 {
public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
        /* limit is set to 5 which means only 5 numbers will be printed
        with the help of terminal operation forEach
        */
    }
}
````

Q #19) Write a program to print 5 random numbers in sorted order using forEach in Java 8?

Answer: The below program generates 5 random numbers with the help of forEach in Java 8. You can set the limit variable to any number depending on how many random numbers you want to generate. The only thing you need to add here is the sorted() method.

````
import java.util.Random;
class Java8 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);
        /* sorted() method is used to sort the output after
         terminal operation forEach
         */
    }
}
````

Q #21) Write a Java 8 program to get the sum of all numbers present in a list?
Answer: In this program, we have used ArrayList to store the elements. Then, with the help of the sum() method, we have calculated the sum of all the elements present in the ArrayList. Then it is converted to Stream and added each element with the help of mapToInt() and sum() methods.
````
import java.util.*;
class Java8 {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // Added the numbers into Arraylist
        System.out.println(sum(list));
    }
    public static int sum(ArrayList<Integer> list) {
        return list.stream().mapToInt(i -> i).sum();
        // Found the total using sum() method after 
        // converting it into Stream
    }
}
````

Q #22) Write a Java 8 program to square the list of numbers and then filter out the numbers greater than 100 and then find the average of the remaining numbers?
````
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Java8 {
public static void main(String[] args) {
Integer[] arr = new Integer[] { 100, 100, 9, 8, 200 };
List<Integer> list = Arrays.asList(arr);
// Stored the array as list
OptionalDouble avg = list.stream().mapToInt(n -> n * n).filter(n -> n > 100).average();

        /* Converted it into Stream and filtered out the numbers
            which are greater than 100. Finally calculated the average 
        */
         
        if (avg.isPresent())
            System.out.println(avg.getAsDouble());
    }
}
````

LOWEST AND HIGHEST

````
import java.util.Comparator;
import java.util.stream.*;

public class Java8{
public static void main(String args[]) {

    Integer highest = Stream.of(1, 2, 3, 77, 6, 5)
                        .max(Comparator.comparing(Integer::valueOf))
                        .get();
     
    /* We have used max() method with Comparator.comparing() method
       to compare and find the highest number 
    */
          
    Integer lowest = Stream.of(1, 2, 3, 77, 6, 5)
                        .min(Comparator.comparing(Integer::valueOf))
                        .get();
     
    /* We have used max() method with Comparator.comparing() method
       to compare and find the highest number 
    */
     
    System.out.println("The highest number is: " + highest);
    System.out.println("The lowest number is: " + lowest);
}
}
````

Number of strings whose length is greater than 5

````
long count = list.stream().filter(str -> str.length() > 5).count();
````

Stream Concat
````
        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
````

Remove Duplicates
````
        Set<Integer> setNoDups = listdup.stream().collect(Collectors.toSet());
````

````
private Map<Gender, List<Employee>> mapEmployeeNameByGender(List<Employee> employees) {
        Map<Gender, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
        return collect;
    }
````
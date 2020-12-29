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


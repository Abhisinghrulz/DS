package theory.javaCoreTheory.java8;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJavaEight {

    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };


    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(arrayOfEmps);

        //Two ways to gener
        Stream.of(arrayOfEmps);
        employees.stream();
        Stream<Integer> integerStream = Stream.of(1, 2, 4);

        //For Each
        employees.stream().forEach(e -> e.salaryIncrement(10.0));

        //Collect
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employees1 = employees.stream()
                .map(employeeRepository::findById)
                .collect(Collectors.toList());


        List<Employee> employees2 = employees.stream().collect(Collectors.toList());

        //filter
        List<Employee> employees3 = employees.stream()
                .map(employeeRepository::findById)
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > 200000.0)
                .collect(Collectors.toList());


        //findFirst
        Employee employees4 = Stream.of(arrayOfEmps)
                .map(employeeRepository::findById)
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > 100000)
                .findFirst()
                .orElse(null);

        //To Array
        Employee[] employees5 = employees.stream().map(employeeRepository::findById).toArray(Employee[]::new);

        //Flat Map
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        TestJavaEight testJavaEight = new TestJavaEight();

        System.out.println(testJavaEight.getIdsOfEmployeeWithSalaryMoreThan5000(employees, 200000.0));

        System.out.println(testJavaEight.totalSum(employees));

        Map<String,String> map = new LinkedHashMap<>();
        map.put("AB","CD");
        map.put("DE","EG");
        System.out.println(map.keySet().stream().collect(Collectors.toList()));


        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5, 6, 7).max((e1, e2) -> {
            if (e1 == e2) {
                return 0;
            } else if (e1 > e2) {
                return 1;
            } else {
                return -1;
            }
        });

        System.out.println(max.get());

        Optional<Integer> min = Stream.of(1, 2, 3, 4, 5, 6, 7).min((e1, e2) -> {
            if (e1 == e2) {
                return 0;
            } else if (e1 > e2) {
                return 1;
            } else {
                return -1;
            }
        });

        System.out.println(min.get());

        List<Employee> collect = employees.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
        for(Employee e : collect)
        {
            System.out.println(e.getName());
        }

        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7).mapToInt(e -> e).sum();
        System.out.println(sum);
    }

    private List<Integer> getIdsOfEmployeeWithSalaryMoreThan5000(List<Employee> employees, Double salary) {
        List<Integer> collect = employees.stream().filter(e -> e.getSalary() > salary).map(employee -> employee.getId()).collect(Collectors.toList());
        return collect;
    }

    private Map<Gender, List<Employee>> mapEmployeeNameByGender(List<Employee> employees) {
        Map<Gender, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
        return collect;
    }

    private Double totalSum(List<Employee> employees){
        double sum = employees.stream().mapToDouble(Employee::getSalary).sum();
        return sum;
    }

}

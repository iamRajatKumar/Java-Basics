package JavaAssignment.EmployeeStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees =  Arrays.asList(
            new Employee("Jhon","CSE", 51000),
            new Employee("Alice","HR", 70000),
            new Employee("Bob","Finance", 30000),
            new Employee("Rajat","CSE", 45000),
            new Employee("Rishabh","Finance", 67000),
            new Employee("Frank","HR", 35000)
        );

        Map<String,Optional<Employee>> highestpaid = employees.stream()
        .filter(e -> e.getSalary()>50000)
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
        ));
        highestpaid.forEach((dept, empOpt) ->
        System.out.println(dept+ ":" +empOpt.orElse(null))
        );
    }
}

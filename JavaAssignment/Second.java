package JavaAssignment;

//Given a List<String> of names, write a lambda expression that filters our all the names that dont 
//start with letter "b" and then convert the rest to upper case.
//Explain how Lambda expressions enable this.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Second {
    public static void main(String[] args) {
        List<String> names =  Arrays.asList("Rajat"," 'boby","Ramesh", "brad", "ben");
        List<String> result = names.stream()
        .filter(name -> name.startsWith("b"))
        .map(name -> name.toUpperCase())
        .collect(Collectors.toList());

        System.out.println(result);

    }
}

// Explanation

// Lambda expression is a concise way to represent an Anonymous function
// 1. name -> name.startsWith("b") This implements Predicate<String> interface.
//    It filters Stream by including names starts with "b".
// 2. name -> name.toUpperCase() this implements Function<String, String> interface.
//     Transforms remaining names to upper case

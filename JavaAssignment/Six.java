package JavaAssignment;

import java.util.Arrays;
import java.util.List;

public class Six {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int result = numbers.stream()
                    .filter(n-> n%2 == 0)
                    .mapToInt(n -> n*2)
                    .sum();
        System.out.println(result);
    }
}

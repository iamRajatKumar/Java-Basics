package CollectionFramework.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperationsOnSet {
    public static void main(String[] args) {
        //three operation in set Interface are
        // Intersection
        // Union 
        // Difference
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(new Integer[]{ 1, 3, 2, 4, 8, 9, 0}));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5 }));
        
        // UNION
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of two set");
        System.out.println(union);

        //Intersection
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of two Set");
        System.out.println(intersection);

        //differece
        Set<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("Difference of two Set");
        System.out.println(difference);
    }
}

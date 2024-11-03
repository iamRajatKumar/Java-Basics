package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Rajat");
        set.add("deepali");
        set.add("Sharma");
        set.add("Raj");
        set.add("Myname");

        
        for (String name : set) {
            System.out.println(name); 
        }
        System.out.println(set.contains("Rajat"));
    }
}

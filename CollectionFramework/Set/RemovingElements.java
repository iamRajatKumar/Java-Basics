package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class RemovingElements {
   public static void main(String[] args) {
    
    Set<String> set =  new HashSet<String>();
    set.add("Rajat");
    set.add("Sharma");
    set.add("Deepali");
    set.add("Ravi");
    set.add("Gargi");

    System.out.println("Initial value of Set"+set);

    set.remove("Sharma");
    System.out.println("Set value after removing"+set);
   } 
}

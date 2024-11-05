package CollectionFramework.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("India");
        set.add("Australia");
        set.add("South Africa");
        set.add("India");

        System.out.println("Original set : "+set);
        set.remove("Australia");

        System.out.println("Set after removing : "+set);

        System.out.println("Iteration on Set : ");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }   
}

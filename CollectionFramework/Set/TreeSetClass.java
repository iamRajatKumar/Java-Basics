package CollectionFramework.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<String>();
        // Adding elements into the TreeSet
        // using add()
        treeSet.add("India");
        treeSet.add("Australia");
        treeSet.add("South Africa");

        // Adding the duplicate
        // element
        treeSet.add("India");

        // Displaying the TreeSet
        System.out.println(treeSet);

        // Removing items from TreeSet
        // using remove()
        treeSet.remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:" + treeSet);

        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = treeSet.iterator();

        while (i.hasNext())
            System.out.println(i.next());
    }
}

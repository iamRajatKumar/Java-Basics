package CollectionFramework.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        Set<String> set =  new HashSet<String>();

        set.add("India");
        set.add("Austrialia");
        set.add("South Africa");
        //Adding duplicate elements
        set.add("India");
        System.out.println("origignal Set: "+set);
        set.remove("Austrialia");
        System.out.println("Set after Removing : "+set);
        Iterator<String> i = set.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());           
        }
    }    
}

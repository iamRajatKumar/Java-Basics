package CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class SetAddAll {
    public static void main(String[] args) {
        Set<String> str1 = new TreeSet<String>();
        str1.add("Welcome");
        str1.add("To");
        str1.add("Learning");
        str1.add("Basics");
        str1.add("of");
        str1.add("java");
        
           System.out.println("String 1 : "+str1);
           Set<String> str2 = new TreeSet<>();
            str2.add("Hello");
            str2.add("World");

            str1.addAll(str2);
            System.out.println("String 1 : "+str1);
    }
}

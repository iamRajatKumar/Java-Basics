package CollectionFramework.LinkedList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Rajat");
        names.add("Deepali");
        names.add("Priya");
        names.add("varun");
        names.add("Sonal");
        names.add("Deepu");
        //   
        System.out.println(names);
        names.add("jhon");
        // after adding a new name in the end
        System.out.println(names);
        // adding a name after a given index in linked list
        names.add(2, "Rajdeep");
        System.out.println(names);
        // for update we use set
        names.set(3, "Khushi");
        System.out.println(names);
        // remove an element from the list
        names.remove(0);
        System.out.println(names);
        }
}

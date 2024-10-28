package CollectionFramework.Comparable_Interface;
import java.util.*;

public class ObjectsInCollection {
    public static void main(String[] args) {
        List<Object> elements =  new LinkedList<>();
        elements.add(new Name("Rajat"));
        elements.add(new Name("Deepali"));
        elements.add(new Name("Gargi"));
        elements.add(new Name("Anjanye"));
        elements.add("Hello");
        elements.add(25);
        elements.add(297.00000452);
        System.out.println(elements);
        
    }
}

class Name{
    @Override
    public String toString() {
        return name;
    }

    private String name;

    public Name(String name) {
        this.name = name;
    }
    
}

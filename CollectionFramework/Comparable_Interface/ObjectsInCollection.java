package CollectionFramework.Comparable_Interface;
import java.util.*;

public class ObjectsInCollection {
    public static void main(String[] args) {
        List<Object> elements =  new LinkedList<>();
        elements.add(new Name1("Rajat"));
        elements.add(new Name1("Deepali"));
        elements.add(new Name1("Gargi"));
        elements.add(new Name1("Anjanye"));
        elements.add("Hello");
        elements.add(25);
        elements.add(297.00000452);
        System.out.println(elements);
        
    }
}

class Name1{
    @Override
    public String toString() {
        return name;
    }

    private String name;

    public Name1(String name) {
        this.name = name;
    }
    
}

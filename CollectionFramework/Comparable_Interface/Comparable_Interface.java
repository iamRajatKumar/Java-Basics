package CollectionFramework.Comparable_Interface;
import java.util.List;
import java.util.LinkedList;

class Name implements Comparable<Name>{
    @Override
    public String toString() {
        return name;
    }

    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Name obj) {
        if (name.length() == obj.name.length()) {
            return 0;
        }else if (name.length()> obj.name.length()){
            return 1;
        }else{
            return -1;
        }
    }
    
}

public class Comparable_Interface {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List names = new LinkedList<>();
        names.add(new Name("Rajat"));
        names.add(new Name("Deepu"));
        names.add(new Name("Rajdeep"));
        names.add(new Name("Priya"));
        names.add(new Name("Anushka"));

        System.out.println(names);
        names.sort(null);
        System.out.println(names);
    }
}

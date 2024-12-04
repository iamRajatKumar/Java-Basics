package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Name other = (Name) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Name [Name=" + name + "]";
    }

    @Override
    public int compareTo(Name o) {
        return name.compareTo(o.getName());
    }
}

public class MoreOnCollections {
    public static void main(String[] args) {
        // Set<String> set = new HashSet<String>();
        // set.add("Rajat");
        // set.add("Deepali");
        // set.add("Rajveer");
        // set.add("Deepti");
        
        // List<String> list = new ArrayList<>();
        // list.addAll(set);
        // Collections.sort(list);
        // System.out.println(list);
        // System.out.println(Collections.binarySearch(list,"Rajat"));
        
        // using name class
        Set<Name> set = new HashSet<>();
        set.add(new Name("Rajat"));
        set.add(new Name("Deepali"));
        set.add(new Name("Rajveer"));
        set.add(new Name("Deepti"));
        
        List<Name> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, new Name("Rajat")));
        
    }
}



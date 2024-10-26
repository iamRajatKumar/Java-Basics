package CollectionFramework.List.ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listNames = new ArrayList<>();
        System.out.println("\n");
        listNames.add("Rajat");
        listNames.add("Sharma");
        listNames.add("Deepali");
        listNames.add("RajDeep");
        listNames.add("Jennifer");
        listNames.add("Moksha");
        listNames.add("Adarsh");
        listNames.add("Akash");
        System.out.println(listNames);

        //accessing element using for loop
        // for (String name: listNames) {
        //     System.out.println(name);
        // }

        //for getting specific index value in arraylist assume index at 3
        System.out.println(listNames.get(3));

        //to remove a value from arraylist
        listNames.remove(3);
        System.out.println(listNames);

        listNames.replaceAll(e -> e.toUpperCase());
        System.out.println(listNames);

        // listNames.clear();
        // System.out.println(listNames);
        // listNames.clone();
        // System.out.println(listNames);
        System.out.println(listNames.remove("rajat"));
        //System.out.println(listNames);

        System.out.println(listNames.set(0, "Priya"));
        System.out.println(listNames);

        System.out.println(listNames.indexOf("ADARSH"));
        System.out.println(listNames.size());
    }
}

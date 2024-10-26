package CollectionFramework.LinkedList;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Rajat");
        list1.add("Deepali");
        list1.add("Ravi");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Engineer");
        list2.add("Bank Manager");
        list2.add("Manager");
        //calling list using printList method
        new Main2().printList(list2);

        //calling list1 with printList method
        new Main2().printList(list1);

        // System.out.println(list1);
        // System.out.println(list2);

        // for(String name: list1){
        //     System.out.println(name);
        // }

    }
    // creating a method
    void printList(List<String> list){
        for(String name: list){
                System.out.println(name);
            }
    }
}

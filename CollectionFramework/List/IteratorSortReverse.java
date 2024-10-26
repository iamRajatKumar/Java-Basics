package CollectionFramework.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class IteratorSortReverse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Engineer");
        list.add("doctor");
        list.add("Product Manager");
        list.add("Pharma");
        list.add("Administrator");
        //new IteratorSortReverse().printList(list); 
        //before sort
        System.out.println("original list : "+list);
        list.sort(null); // null means we want to sort in natural order like in Ascii
        System.out.println("Sort using Ascii Value : "+list);

        //reverse the list
        Collections.reverse(list);
        System.out.println("Reverse : "+list);
    }

    void printList(List<String> list){
        Iterator<String> data = list.listIterator();
        while (data.hasNext()) {
            System.out.println(data.next());
        }
    }
}

package Generics;
//Generics method can be placed inside a generics class

// import java.util.ArrayList;
import java.util.List;

class GenericMethod{
    public <E> void printListData(List<E> list){
        for(E elements: list){
            System.out.println(elements);
        }
    }
    public <E> void printArrayData(E[] arrayData){
        for(E element : arrayData){
            System.out.println(element);
        }
    }
}

public class L4_GenericsMethod {
   public static void main(String[] args) {
    // List<Integer> list1 = new ArrayList<>();
    // list1.add(12);
    // list1.add(10);
    // list1.add(2);
    // list1.add(21);
    // list1.add(5);
    // list1.add(56);
    // list1.add(123);
    // new GenericMethod().printListData(list1);
    // List<String> list2 = new ArrayList<>();
    // list2.add("one");
    // list2.add("two");
    // list2.add("eight");
    // new GenericMethod().printListData(list2);

    // System.out.println("-----------------------");

    String[] stringArray = {"Rajat","Deepali","Rajdeep", "Dips"};
    new GenericMethod().printArrayData(stringArray);
    System.out.println("**********************");
    Integer[] intArray = {1,2,3,4};
    new GenericMethod().printArrayData(intArray);
} 
}

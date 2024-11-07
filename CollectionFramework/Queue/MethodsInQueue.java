package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

//there are some common methods in Queue
// add, offer, remove, poll, element, peek

public class MethodsInQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //add method
        queue.add("Rajat");
        queue.add("Deepali");
        queue.add("Rajdeep");

        System.out.println("Queue : "+queue);

        //remove method
        String front = queue.remove();
        System.out.println("Remove elememt: " +front);
        
        System.out.println("After Removing: "+queue);

        queue.add("Deepu");

        //Peek method in queue
        String peek = queue.peek();
        System.out.println("Peeked element : "+peek);

        //queue after peeked
        System.out.println("Queue after peeked : "+queue);
    }
}

package CollectionFramework.Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(14);
        queue.add(78);
        //Original Queue
        System.out.println("Elemets in P Queue"+queue);
        //Printing top element of Prirority Queue
        System.out.println(queue.peek());

        //Priniting the top element and removing it from priority queue
        System.out.println(queue.poll());

        //pring the top element again
        System.out.println(queue.peek());

        // Queue after removing top ele,emy
        System.out.println("Elemets left in P Queue"+queue);
        
    }
}

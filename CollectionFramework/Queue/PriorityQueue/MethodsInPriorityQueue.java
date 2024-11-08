package CollectionFramework.Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MethodsInPriorityQueue {
    public static void main(String[] args) {
        Queue<String> prirorityQueue = new PriorityQueue<String>();
        //Prirority queue is an implementation of queue interface
        prirorityQueue.add("Rajat");
        prirorityQueue.add("Deepali");
        prirorityQueue.add("Sharma");

        System.out.println(prirorityQueue);
    }
}

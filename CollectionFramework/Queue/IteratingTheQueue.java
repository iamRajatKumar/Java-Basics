package CollectionFramework.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class IteratingTheQueue {
    public static void main(String[] args) {
        Queue<String> pQueue = new PriorityQueue<>();
        pQueue.add("Rajat");
        pQueue.add("Kumar");
        pQueue.add("Anjaney");
        //sout before iterating
        System.out.println(pQueue);
        
        @SuppressWarnings("rawtypes")
        Iterator iterator = pQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}

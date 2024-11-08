package CollectionFramework.Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class AddMethod {
    public static void main(String[] args) {
        Queue<String> myqueue = new PriorityQueue<String>();

        myqueue.add("Rajat");
        myqueue.add("Deepali");
        myqueue.add("Sharma");

        System.out.println(myqueue);
    }
}

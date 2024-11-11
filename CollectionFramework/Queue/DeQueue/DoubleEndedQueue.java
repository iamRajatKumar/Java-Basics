package CollectionFramework.Queue.DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("R");
        deque.add("a");
        deque.add("j");
        deque.add("a");
        deque.add("T");

        System.out.println(deque);
    }
}

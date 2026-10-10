package collectionFramework;

import java.util.*;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(40);

        System.out.println("Queue: " + q);
        System.out.println("Front element: " + q.peek());
        System.out.println("Removed element: " + q.poll());
        System.out.println("Queue after poll: " + q);
        System.out.println("Size: " + q.size());
        System.out.println("Is empty: " + q.isEmpty());
        System.out.println("Contains 30: " + q.contains(30));

        q.remove(30);
        System.out.println("After removing 30: " + q);

        System.out.println("Front element: " + q.element());

        q.clear();
        System.out.println("After clear: " + q);
        System.out.println("Is empty: " + q.isEmpty());
    }
}
package collectionFramework;

import java.util.*;

public class PriorityQueue {
    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> pq =
                new java.util.PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(40);
        pq.offer(20);

        System.out.println("Priority Queue: " + pq);
        System.out.println("Top element: " + pq.peek());

        System.out.println("Removed element: " + pq.poll());

        System.out.println("After poll: " + pq);
        System.out.println("Size: " + pq.size());
    }
}
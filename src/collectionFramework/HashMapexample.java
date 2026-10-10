package collectionFramework;

import java.util.*;

public class HashMapexample {
    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Aviral");
        studentMap.put(102, "Rahul");
        studentMap.put(103, "Priya");
        studentMap.put(104, "tripathi");
        studentMap.put(105, "Dogra");
        studentMap.put(106, "Sharma");

        System.out.println("Student Map: " + studentMap);

        System.out.println("Name for ID 102: " + studentMap.get(102));

        System.out.println("\nAll Students:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}
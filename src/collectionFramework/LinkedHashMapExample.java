package collectionFramework;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> studentMap = new LinkedHashMap<>();

        studentMap.put(101, "Aviral");
        studentMap.put(102, "Rahul");
        studentMap.put(103, "Priya");
        studentMap.put(104, "tripathi");
        studentMap.put(105, "sharma");
        studentMap.put(106, "dogra");

        System.out.println("Student Map: " + studentMap);

        System.out.println("Name for ID 102: " + studentMap.get(102));

        System.out.println("\nAll Students:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}
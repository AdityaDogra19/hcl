package LambdaExpression;

import java.util.*;

class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class GenericDemo {

    // Generic method
    public static <T> void display(T value) {
        System.out.println(value);
    }

    // Unbounded wildcard: accepts any type of list
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Upper-bounded wildcard: Number or its subclasses
    public static double sum(List<? extends Number> list) {
        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    // Lower-bounded wildcard: Integer or its supertypes
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}

public class Main {
    public static void main(String[] args) {

        // Generic class
        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Java");

        System.out.println(b1.getValue());
        System.out.println(b2.getValue());

        // Generic method
        GenericDemo.display(50);
        GenericDemo.display("Hello");

        // Unbounded wildcard (?)
        List<String> names = Arrays.asList("Aditya", "Rahul");
        GenericDemo.printList(names);

        // Upper-bounded wildcard (? extends Number)
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        System.out.println("Sum: " + GenericDemo.sum(numbers));

        // Lower-bounded wildcard (? super Integer)
        List<Number> values = new ArrayList<>();
        GenericDemo.addNumbers(values);
        System.out.println(values);
    }
}
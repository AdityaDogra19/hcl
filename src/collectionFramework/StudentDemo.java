package collectionFramework;
import java.util.*;

class Student {
    String name;
    int rollNo;
    int age;
    double marks;

    Student(String name, int rollNo, int age, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return name + " " + rollNo + " " + age + " " + marks;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aditya", 1, 22, 85.5));
        students.add(new Student("Rahul", 2, 21, 78.0));
        students.add(new Student("Aman", 3, 23, 91.0));
        students.add(new Student("Priya", 4, 20, 88.5));
        students.add(new Student("Rohit", 5, 22, 76.0));
        students.add(new Student("Neha", 6, 21, 95.0));
        students.add(new Student("Karan", 7, 24, 82.0));
        students.add(new Student("Simran", 8, 20, 90.0));
        students.add(new Student("Vikas", 9, 23, 72.5));
        students.add(new Student("Anjali", 10, 22, 89.0));

        System.out.println("Original Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(Comparator.comparingInt(s -> s.age));

        System.out.println("\nSorted by Age:");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(Comparator.comparingDouble(s -> s.marks));

        System.out.println("\nSorted by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
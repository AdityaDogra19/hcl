package collectionFramework;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class EmployeeCRUD {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // CREATE
        employees.add(new Employee(103, "Aman", 40000));
        employees.add(new Employee(101, "Rahul", 30000));
        employees.add(new Employee(102, "Priya", 35000));

        // READ using Iterator
        System.out.println("Employees using Iterator:");
        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // READ using ListIterator (forward)
        System.out.println("\nForward using ListIterator:");
        ListIterator<Employee> li = employees.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        // READ using ListIterator (backward)
        System.out.println("\nBackward using ListIterator:");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // UPDATE employee with id 101
        for (Employee e : employees) {
            if (e.id == 101) {
                e.name = "Rohit";
                e.salary = 45000;
            }
        }

        System.out.println("\nAfter Update:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // DELETE employee with id 102
        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            if (itr.next().id == 102) {
                itr.remove();
            }
        }

        System.out.println("\nAfter Delete:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // INCREASING order of salary
        employees.sort(Comparator.comparingDouble(e -> e.salary));

        System.out.println("\nIncreasing Salary Order:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // DECREASING order of salary
        employees.sort(
                Comparator.comparingDouble((Employee e) -> e.salary).reversed()
        );

        System.out.println("\nDecreasing Salary Order:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
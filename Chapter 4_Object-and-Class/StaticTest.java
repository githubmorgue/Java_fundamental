/*
 * This program demonstrates static methods.
 */

public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        var staff = new Employee1[3];

        staff[0] = new Employee1("Tom", 40000);
        staff[1] = new Employee1("Dick", 60000);
        staff[2] = new Employee1("Harry", 65000);

        // print out information about all Employee objects
        for (Employee1 e : staff) {
            System.out.println("name" + e.getName() + ",id=" + e.getId() + ",salary="
                 + e.getSalary());
        }

        int n = Employee1.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }
}

/**
 * Employee1
 */

class Employee1 {
    private static int nextId= 1;

    private String name;
    private double salary;
    private int id;

    public Employee1(String n, double s) {
        name = n;
        salary = s;
        id = advanceId();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int advanceId() {
        int r = nextId; // obtain next available id
        nextId++;
        return r;
    }

    public static int getNextId() {
        return nextId;
    }

    // unit test
    public static void main(String[] args) {
        var e = new Employee1("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
/*
 * This program demonstrates static methods.
 */

public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        var staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name" + e.getName() + ",id=" + e.getId() + ",salary="
                 + e.getSalary());
        }

        int n = Employee.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }
}

/**
 * Employee
 */

class Employee {
    private static int nextId= 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
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
        var e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
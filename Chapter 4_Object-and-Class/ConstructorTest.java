import java.util.*;

/*
 * This program demonstrates object construction.
 */

public class ConstructorTest {
    public static void main(String[] args) {
        // fill the staff with three Employee objects
        var staff = new Employee4[3];

        staff[0] = new Employee4("Harry", 40000);
        staff[1] = new Employee4(60000);
        staff[2] = new Employee4();

        // print out information about all Employee objects
        for (Employee4 e : staff)
            System.out.println("name=" + e.getName() + ",id=" + 
                e.getId() + ",salary=" + e.getSalary());
    }
}

/**
 * class Employee4 
 */
class Employee4 {
    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;

    private static Random generator = new Random();

    // static initialization block
    static {
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    {
        id = nextId;
    }

    // three overload constructors
    public Employee4(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee4(double s) {
        // calls the Employee(String, double) constructor
        this("Employee4 #" + nextId, s);
    }

    // the default constructor
    public Employee4() {
        // name initialized to ""--see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
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
}
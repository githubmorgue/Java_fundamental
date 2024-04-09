import java.time.*;

/*
 * This program test Employee class.
 */

public class EmployeeTest {
    public static void main(String[] args) 
    {
       // fill the staff array with three Employee objects
       Employee0[] staff = new Employee0[3];
       
       staff[0] = new Employee0("Carl Cracker", 75000, 1987, 12, 15);
       staff[1] = new Employee0("Harry Hacker", 50000, 1989, 10, 1);
       staff[2] = new Employee0("Tony Tester", 40000, 1990, 3, 15);

       // raise everyone's salary by 5%
       for (Employee0 e : staff)
        e.raiseSalary(5);
    
       // print out information about all Employee objects
       for (Employee0 e : staff)
        System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + 
            ",hireDay=" + e.getHireDay());
    }
}


class Employee0 {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee0(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent /100;
        salary += raise;
    }
}
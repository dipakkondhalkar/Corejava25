/*Q.2
Sorting Custom Objects
Store Employee objects (id, name, salary).
Sort using Collections.sort() with Comparator (by name or salary).
*/

import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            int id = sc.nextInt();

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        
        Collections.sort(list, new Comparator<Employee>()
		{
            public int compare(Employee e1, Employee e2)
			{
                return e1.getName().compareToIgnoreCase(e2.getName());
            }
        });

        System.out.println("\nEmployees sorted by name:");
        for (Employee e : list) {
            System.out.println(e);
        }

     
        Collections.sort(list, new Comparator<Employee>()
		{
            public int compare(Employee e1, Employee e2)
			{
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        }); 

        System.out.println("\n Employees sorted by salary (descending):");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}

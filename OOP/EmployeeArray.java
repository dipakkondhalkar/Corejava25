import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        
        Employee[] empArr = new Employee[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            
            empArr[i] = new Employee(id, name, salary);
        }

       
        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            empArr[i].display();
        }

        sc.close();
    }
}

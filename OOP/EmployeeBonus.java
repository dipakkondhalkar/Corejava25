import java.util.*;

class Employee {
    private int id;
    private String name;
    private int salary;  // changed from Salary to salary (convention)

    // Getter and Setter methods
    public void setid(int id) { this.id = id; }
    public int getid() { return id; }

    public void setname(String name) { this.name = name; }
    public String getname() { return name; }

    public void setSalary(int salary) { this.salary = salary; }
    public int getSalary() { return salary; }

    // Bonus method: increase salary by 10% if < 30000
    public double bonus() {
        if (salary < 30000) {
            salary = salary + (salary * 10) / 100;
        }
        return salary; // always return salary
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3; // number of employees
        Employee emp[] = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter Employee DETAILS :");

            System.out.print("Enter Id: ");
            emp[i].setid(sc.nextInt());
            sc.nextLine(); // consume newline

            System.out.print("Enter Name : ");
            emp[i].setname(sc.nextLine());

            System.out.print("Enter Salary: ");
            emp[i].setSalary(sc.nextInt());
        }

        // Display employees eligible for bonus
        System.out.println("\nEmployees eligible for bonus (salary < 30000):");
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getSalary() < 30000) {
                System.out.println("ID: " + emp[i].getid() +
                                   ", Name: " + emp[i].getname() +
                                   ", Total Salary with Bonus: " + emp[i].bonus());
            }
        }

       +
    }
}

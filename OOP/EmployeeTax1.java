// Problem 8:
// Create a class Employee with fields: empId, name, annualSalary.
// Add a method calculateTax():
// If salary > 5,00,000 → 10% tax
// If salary > 2,50,000 → 5% tax
// Else → No tax
// Display tax amount using displayTax().

import java.util.Scanner;

// POJO class
class Employee {
    private int empId;
    private String name;
    private double annualSalary;
    private double tax;

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getTax() {
        return tax;
    }

    // Setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Business logic: calculate tax based on salary slabs
    public void calculateTax() {
        if (annualSalary > 500000) {
            tax = annualSalary * 0.10;
        } else if (annualSalary > 250000) {
            tax = annualSalary * 0.05;
        } else {
            tax = 0;
        }
    }

    // Display tax information
    public void displayTax() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.printf("Annual Salary: %.2f\n", annualSalary);
        System.out.printf("Calculated Tax: %.2f\n", tax);
    }
}

// Driver class
public class EmployeeTax1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setEmpId(sc.nextInt());

        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Annual Salary: ");
        emp.setAnnualSalary(sc.nextDouble());

        emp.calculateTax();     // Logic
        emp.displayTax();       // Output


    }
}
/*
output:
Enter Employee ID: 12
Enter Employee Name: dip
Enter Annual Salary: 5100000
Employee ID: 12
Name: dip
Annual Salary: 5100000.00
Calculated Tax: 510000.00   */


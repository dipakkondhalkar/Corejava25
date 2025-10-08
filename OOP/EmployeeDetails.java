/*6. Problem:
 Create a class Employee with fields: id, name, department, and salary. Create one object, assign values manually, and display the details using a method showDetails().
Objective: Understand object creation and basic method calling.*/
class Employee {
    int id;
    String name;
    String department;
    int salary;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to display employee details
    void showDetails() {
        System.out.println("<-----ENTER THE EMPLOYEE DETAILS----->");
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Department: " + getDepartment());
        System.out.println("Employee Salary: " + getSalary());
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setId(1);
        obj.setName("Manish");
        obj.setDepartment("Computer");
        obj.setSalary(5000);
        obj.showDetails();
    }
}

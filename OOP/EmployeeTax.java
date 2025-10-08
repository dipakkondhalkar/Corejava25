/*8. Problem:
 Create a class Employee with fields: empId, name, annualSalary. Add a method calculateTax():
If salary > 5,00,000 → 10% tax


If salary > 2,50,000 → 5% tax


Else → No tax. 
 Display tax amount using displayTax(). */




class Employee {
    private int empId;
    private String name;
    private int annualSalary;

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Method to calculate tax
	double tax;
    public void calculateTax() {
	
        if (annualSalary > 500000) {
		
            tax = annualSalary * 0.10;
			
        } else if (annualSalary > 250000) {
		
            tax = annualSalary * 0.05;
        } else {
            tax = 0;
        }
    }

   
  public void displayTax() {
 
		
        System.out.println("Employee Name: " + name);
		
        System.out.println("Annual Salary: " + annualSalary);
		
        System.out.println("Calculated Tax: " + tax);
    }
}

public class EmployeeTax {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting employee details
        emp.setEmpId(101);
        emp.setName("Manish");
        emp.setAnnualSalary(254000);
       emp.calculateTax();
        // Displaying tax
        emp.displayTax();
    }
}
/*
output:
Employee Name: Manish
Annual Salary: 254000
Calculated Tax: 12700.0   */

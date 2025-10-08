/*8. Problem:
 Create a class Employee with fields: empId, name, annualSalary. Add a method calculateTax():
If salary > 5,00,000 → 10% tax
If salary > 2,50,000 → 5% tax
Else → No tax
 Display tax amount using displayTax().
Objective: Logical conditions and numeric calculation.
*/


import java.util.*;
class Employee
{
    int empId;
	String name;
	double annualSalary;
	double tax;
	
	//Method to set emplyee details.
	
	public int getEmpId()
	{
	    return empId;
	}
	public String getName()
	{
	   return name;
	}
	public int getannualSalary()
	{  
	   return annualSalary;
	}
	public int getTax()
	{
	   return tax;
	}
	
public void calculateTax()
 {
 
       if(annualSalary>50000)
	   {
	      tax = annualSalary * 0.10;
	   }
	   else if(annualSalary > 250000)
	   {
	      tax = and * 0.05;
	   }
	   else
	   {
	      tax = 0;
	   }
   }
	
	public void displayTax()
	{
	  System.out.println("Employee ID :" + empId);
	  System.out.println("Name :" + name);
	  System.out.println("Annual Salary " + annualSalary);
	  System.out.println("Calcutale tax : " + tax);
	}
}	


public class EmployeeTax1
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  Employee emp = new Employee();
	  
	  System.out.println("Enter Employee ID: ");
	  emp.setEmpId(sc.nextInt());
	  
	  sc.nextLine();
	  
	  System.out.print("Enter Employee Name :");
	  emp.setAnnualSalary(sc.nxtDouble());
	  
	  emp.calculateTax();
	  emp.displayTax();
	     
   }
 }
	
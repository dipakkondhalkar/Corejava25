/*6. Problem:
 Create a class Employee with fields: id, name, department, and salary. Create one object, assign values manually, and display the details using a method showDetails().
Objective: Understand object creation and basic method calling.*/

import java.util.*;
class Employee
{
	int id;
	String name;
    String department;
	int Salary;
	
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
	   this.id = id;	
	}	
	public int getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public int getdept()
	{
		return department;
	}
	public void setdepartment(int department)
	{
		this.department = department;
	}	
	public  int getSalary()
	{
		return Salary;
	}
	public void setSalary(int Salary)
	{
		this.Salary = Salary;
	}


void showDetails()
{
	System.out.println("ENTER THE EMEPLOYEE DETAILS -->");
	Ssytem.out.println("Employee ID " + getid);
	System.out.println("Employee Name "+ getname);
	System.out.println("Employee Department "+ department);
	System.out.println(" Employee Salary is " + salary);
	
}	
}

public class EmpoyeeDetails
{
	public static void main(String[]args)
	{
		Employee obj = new Employee();
		obj.setid(01);
		obj.setname("Manish");
		obj.setdepartment("computer");
	    obj.setSalary(5000);
		obj.showDetails();
	} 
}	
	












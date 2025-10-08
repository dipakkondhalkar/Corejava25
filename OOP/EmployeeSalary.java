/*Q3. Design a Java program with a default constructor for an Employee (id, name, basicSalary).
 Operations:
Calculate HRA = 10% of basic, DA = 5% of basic.
Find gross salary = basic + HRA + DA.
Display if gross salary > 50,000.*/

import java.util.*;
class Employee
{
    int id;
	String name;
	int basicsalary;
	Scanner sc = new Scanner(System.in);
	
	Employee()
	{
	    System.out.println("-----------------");
		System.out.println("Enter Id :");
	    id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("-----------------");
		System.out.println("Enter Name :");
		name = sc.nextLine();
		
		System.out.println("------------------");
		System.out.println("Enter basicSalary");
		basicsalary = sc.nextInt();
		
		double Hra = basicsalary *0.10;
		System.out.println("HRA of Employee is : " + Hra);
		
		double DA = basicsalary *0.05;
		System.out.println("DA of Employee is: "  + DA);
		
		double GA = basicsalary + Hra + DA;
		
		if(GA > 50000)
		{
		   System.out.println("Gross Salary is " + GA);
		}
		else
		{
		  System.out.println("No Gross Salary " );
		}
	  
	}
}

public class EmployeeSalary
{
    public static void main(String []args)
	{
	   Employee a = new Employee();
	
	}

}
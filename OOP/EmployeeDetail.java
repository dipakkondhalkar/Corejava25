/*1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.
Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.*/

import java.util.*;

class Employee
{
   String name;
   double salary;
   
   void set(String name, double salary)
   {
      this.name = name;
	  this.salary = salary;
   }
}
class Manager  extends Employee
{   
   double bonus = 0;
   void show()
    {  
	    bonus  = salary +(salary * 0.20);
		System.out.println("Employee Bonus : " + bonus);
	     
	}   
}
class Developer extends Employee
{  
   double bonus = 0;
   void show()
   {
       bonus = salary + (salary * 0.10);
	   System.out.println("Developer Bonus : "+ bonus);
   }
}

public class EmployeeDetail
{
  public static void main(String []args)
  {
     Scanner sc =new Scanner(System.in);
	 System.out.println("Enter Employee Details :");
	 
	 System.out.println("Enter Name of Employee:");
	 String n =sc.next();
	 
	 System.out.println("Enter Salary Of Manager :");
	 int sal = sc.nextInt();
	 
	 Manager m = new Manager();
	 m.set(n, sal);
	 m.show();
	 
	 System.out.println("Enter Name of Developer:");
	 String nam = sc.next();
	 
	 System.out.println("Enter Salary of Developer:");
	 int s = sc.nextInt();
	 Developer d1 = new Developer();
	 d1.set(nam, s);
	 	 d1.show();

	 
  }

}
/*
output:
Enter Employee Details :
Enter Name of Employee:
dipak
Enter Salary Of Manager :
100
Employee Bonus : 120.0
Enter Name of Developer:
vijay
Enter Salary of Developer:
200
Developer Bonus : 220.0 */
















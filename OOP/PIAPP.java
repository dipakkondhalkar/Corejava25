/*5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.
For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.
Explanation: 
This tests inheritance with percentage-based calculations in subclasses*/
 

import java.util.*;

class Staff
{
   String name;
   double salary;
   
    void setvalue(String name, double salary)
	{
	   this.name = name;
	   this.salary = salary;
	}
	
	void calculateSalary()
	{
	
	}
} 
class TeachingStaff extends Staff
{
    void calculateSalary()
	{
	   double total = salary + (salary * 0.15);
	   System.out.println("TeachingStaff Salary : "+ total);
	}
  
}
class NonTeachingStaff extends Staff
{
   void calculateSalary()
   {
   
      double total = salary + (salary * 0.10);
	  System.out.println("NonTeachingStaff salary : "+ total);
   }
}


public class PIAPP
{
 public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Teaching Staff DETAILS : ");
	System.out.println("Enter Name :");
	String n = sc.next();
	
	System.out.println("Enter SALARY :");
	double sal = sc.nextDouble();
	
	TeachingStaff  t1 = new TeachingStaff();

    t1.setvalue(n,sal);
	System.out.println("Total Salary is : ");	
	t1.calculateSalary();
	
	System.out.println("Teaching Staff DETAILS : ");
	System.out.println("Enter Name :");
	String nam = sc.next();
	
	System.out.println("Enter SALARY :");
	double sala = sc.nextDouble();
	
	NonTeachingStaff  t2 = new NonTeachingStaff();

    t2.setvalue(nam,sala);
	System.out.println("Total Salary is : ");
t2.calculateSalary();
	
 
 }
}

output:
Teaching Staff DETAILS :
Enter Name :
dipak
Enter SALARY :
1000
Total Salary is :
TeachingStaff Salary : 1150.0
Teaching Staff DETAILS :
Enter Name :
manich
Enter SALARY :
1000
Total Salary is :
NonTeachingStaff salary : 1100.0














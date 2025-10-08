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
   
   void setValue(String name, double salary)
   {
	   this.name = name;
	   this.salary = salary;
	   
   }  
   
   void calculations()//overriding method.
   {
	   System.out.println("Doctor");
   }
}
class TeachingStaff extends  Staff
{
	
	void calculations()
   {
	  double total = salary + (salary * 0.15);
	  System.out.println("Increment:"+total);
   }

}
class NonTeachingStaff extends Staff
{
	void calculations()
   {
	  
	  double total = salary + (salary * 0.10);
	  System.out.println("Increment:"+total); 
   }
}

public class StaffSalary
{ 
   public static void main(String []args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("----------Teaching Staff Details----------");
	   System.out.println("Enter Name : ");
	   String name = sc.next();
	   System.out.println("Enter salary : ");
	   double salary = sc.nextDouble();
	   
	   
	   TeachingStaff t1 = new TeachingStaff();
	   t1.setValue(name, salary);
	   t1.calculations();
	   System.out.println("----------Non Teaching Staff Details----------");
	   System.out.println("Enter Name : ");
	    name = sc.next();
	   System.out.println("Enter salary : ");
	    salary = sc.nextDouble();
		
		
	   NonTeachingStaff t2 = new NonTeachingStaff();
	   t2.setValue(name, salary);
	   t2.calculations();
	   
	   
	   
	   
   }
  
 }
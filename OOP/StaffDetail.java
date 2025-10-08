/*4. Question:
 Create a base class Staff with id, name, and baseSalary.
 Child classes:
SalesStaff → incentive = 10% of sales.
SupportStaff → fixed allowance = ₹2000.
 Calculate and display updated salary.
Concepts Tested: Salary calculation with variable/fixed components, inheritance behavior.*/

import java.util.*;

class Staff
{
   int id;
   String name;
   double baseSalary;
   
   void setValue(int id,String name,double baseSalary)
   {
      this.id = id;
	  this.name = name;
	  this.baseSalary = baseSalary;
   }
   void Calculate()
   {
      System.out.println(" ");
   }
}
class SalesStaff extends Staff
{     double sales;
     SalesStaff(int id, String name, double baseSalary, double sales)
	 {
	    setValue(id,name,baseSalary);
		this.sales = sales;
	 }
	 void calculate()
	 {   
	    double Salary = baseSalary + (sales * 0.10);
		System.out.println("ID  : "+ id);
		System.out.println("Name : " + name);
		System.out.println("Salary of SalesStaff : " + baseSalary);
		System.out.println("Sales  : " + sales);
		System.out.println("BaseSalary of SalesStaff after sales : "+ Salary );
	 }
}
class SupportStaff extends Staff
{   
     SupportStaff(int id, String name , double baseSalary)
	 {
	     setValue(id,name,baseSalary);
	 }
	 void calculate()
	 {
	    double Sal =  baseSalary + 2000;
		System.out.println("ID  : "+ id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + baseSalary);
	    System.out.println("SupportStaff Allowance added 2000 : "+ Sal);
	 }
}
public class StaffDetail
{
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);
	   System.out.println("----Staff Details-------");
	   
	   System.out.println("Enter ID :");
	   int id = sc.nextInt();
	   
	   System.out.println("Enter name :");
	   String name = sc.next();
	   
	   System.out.println("Enter BaseSalary :");
	   double baseSalary = sc.nextDouble();
	   
	   System.out.println("Enter Sales : ");
	   double sales = sc.nextInt();
	   
	   SalesStaff s1 = new SalesStaff(id,name,baseSalary,sales);
	   s1.calculate();
	   
	    System.out.println("----SupportStaff Details-------");
	   
	   System.out.println("Enter ID :");
	    id = sc.nextInt();
	   
	   System.out.println("Enter name :");
	    name = sc.next();
	   
	   System.out.println("Enter BaseSalary :");
	    baseSalary = sc.nextDouble();
	   
	   SupportStaff b1 = new SupportStaff(id,name,baseSalary);
	   b1.calculate();  
    }
}
/*
output:
----Staff Details-------
Enter ID :
123123
Enter name :
dipak
Enter BaseSalary :
1000
BaseSalary of SalesStaff 10% sales : 1100.0
----SupportStaff Details-------
Enter ID :
212323
Enter name :
pratik
Enter BaseSalary :
2000
SupportStaff Allowance added 2000 : 4000.0*/






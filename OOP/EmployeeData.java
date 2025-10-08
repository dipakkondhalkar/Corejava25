/*Q1. Question:
 Create a Java class Employee that uses constructor overloading:
First constructor takes id, name, and basicSalary.
Second constructor takes id, name, basicSalary, and yearsOfExperience.
Perform the following in the constructors:
If experience is given, add a bonus of 10% of salary if experience > 5 years, otherwise 5%.
If experience is not given, assume it is 0 and no bonus is added.
Explanation:
 This question checks the ability to overload constructors, handle optional parameters, and perform logical conditions inside the constructor to modify salary based on experience.
 */

import java.util.*;
class Employee

{
     int id;
	 String name;
	 double basicSalary;
	 int year;
	 
	 // first constructor .
	 Employee(int id, String name,double basicSalary)
	 {
	     this.id  = id;
		 this.name = name;
		 this.basicSalary = basicSalary;
		 this.year = 0;
	 
	 }
	 
	 //second constructor .
	 Employee(int id , String name, double basicSalary , int year)
	 {
	   this.id = id;
	   this.name = name;
	   this.basicSalary = basicSalary;
	   this.year = year;
	   
	   
	   if(year > 5)
	   {
		   this.basicSalary = basicSalary + basicSalary * 0.10;
		  
	   }
	   else
	   {
		   this.basicSalary = basicSalary + basicSalary * 0.05;
	   }
	 }
	 
	 void display()
	 {
	     System.out.println("ID : " + id);
		 System.out.println("Name : " + name);
		 System.out.println("Basic Salary " + basicSalary);
		 System.out.println("Years of Experience  :" + year);
	 }
	 
}
public class EmployeeData
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  
	 //First Constructor.
	  System.out.println("Enter Employee 1 detals ");
	  System.out.println("Enter ID :");
	  int id1 = sc.nextInt();
	  sc.nextLine();
	  
	  System.out.println("Enter Name :");
	  String name1 = sc.nextLine();
	  System.out.println("Enter Salary : ");
	  double Salary1 = sc.nextDouble();
	 
	  Employee  e1 = new Employee(id1,name1,Salary1);
	  
	  
	  //Second contructor.
	  
	  System.out.println("Enter the 2 Details Employee");
	   System.out.println("Enter ID :");
	  int id2 = sc.nextInt();
	  sc.nextLine();
	    System.out.println("Enter Name :");
	  String name2 = sc.nextLine();
	  System.out.println("Enter Salary : ");
	  double salary2 = sc.nextDouble();
	  
	  System.out.println("Enter EXPERIENCE :");
	  int exp2 = sc.nextInt();
	  Employee e2 = new Employee(id2,name2,salary2, exp2);
	  
	  
	  System.out.println("Employee 1 st :----->");
	  
	  e1.display();
	  
	  System.out.println("Employee 2 st :------> ");
	  
	  e2.display();
	  	  
   }
  
}
/*
output:
Enter Employee 1 detals
Enter ID :
1
Enter Name :
deep
Enter Salary :
1000
Enter the 2 Details Employee
Enter ID :
2
Enter Name :
manu
Enter Salary :
1000
Enter EXPERIENCE :
6
Employee 1 st :----->
ID : 1
Name : deep
Basic Salary 1000.0
Years of Experience  :0
Employee 2 st :------>
ID : 2
Name : manu
Basic Salary 1100.0
Years of Experience  :6  */
/*Q.6
Employee and Manager
Create a base class Employee with fields: id, name, salary.
Create a derived class Manager which adds bonus.
Write a method to calculate total salary.
Display employee and manager details.*/

import java.util.*;
class Employee
{
   int id;
   String name;
   double salary;
   
   Employee(int id, String name, double salary)
   {
      this.id = id;
	  this.name = name;
	  this.salary = salary;
   }
   double calculate()
   {
     return salary;
   }
   void display() {
        System.out.println("------------- Employee Details -------------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Total Salary : " + calculate());
    }
}
class Manager extends Employee
{   double bonus;
   Manager(int id, String name, double salary, double bonus)
   {    super(id,name,salary);
     
           this.bonus = bonus;	 
   }
   double calculate()
   {
        return salary + bonus;   
   }
   void display()
   {
      System.out.println("--------------------");
	  System.out.println("Enter ID : " + id);
	  System.out.println("Enter Name : " + name);
	  System.out.println("Enter Salary : " + salary);
	  System.out.println("Total Bonus  " + calculate());  
   }
}
public class EmployeeData
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("-------------Employee Details-----------------");
	 
	 System.out.println("Enter id : ");
	 int id = sc.nextInt();
	 
	 System.out.println("Enter Name :  ");
	 String name = sc.next();
	 
	 System.out.println("Enter Salary : ");
	 double salary = sc.nextDouble();
	 
	 System.out.println("Enter Bonus : ");
	 double bonus = sc.nextDouble();
	 
	 Employee e1 = new Employee(id, name, salary );
	 e1.display();
	 
	 System.out.println("-------------Employee Details-----------------");
	 
	 System.out.println("Enter id : ");
	  id = sc.nextInt();
	 
	 System.out.println("Enter Name :  ");
	 name = sc.next();
	 
	 System.out.println("Enter Salary : ");
     salary = sc.nextDouble();
	 
	 System.out.println("Enter Bonus : ");
	  bonus = sc.nextDouble();
	 
	 Manager m1 = new Manager(id, name, salary , bonus);
	 m1.display();
	 
  }
}
/*
output:
-------------Employee Details-----------------
Enter id :
21211
Enter Name :
dipak
Enter Salary :
1000
Enter Bonus :
5
------------- Employee Details -------------
ID : 21211
Name : dipak
Salary : 1000.0
Total Salary : 1000.0
-------------Employee Details-----------------
Enter id :
312231
Enter Name :
deep
Enter Salary :
2000
Enter Bonus :
10
--------------------
Enter ID : 312231
Enter Name : deep
Enter Salary : 2000.0
Total Bonus  2010.0 */

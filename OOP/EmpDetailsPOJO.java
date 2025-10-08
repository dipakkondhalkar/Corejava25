// Taking input from user and With POJO class, and for loop  , access with object.

import java.util.*;

class Employee
{
   private int id;
   private String name;
   private int salary;
   
   public void setid(int id)
   {
     this.id = id;

   }
   public int getid()
   {
     return id;
   }
   public void setname(String name)
   {
   
       this.name = name ;
   }
   public String getname()
   {
    return name;
   }
   public void setsalary(int salary)
   {
      this.salary = salary;
   }
   public int getsalary()
   {
      return salary;
   }
   
   void display()
   {
       System.out.println("Employee  ID : " + id);
	   System.out.println("Employee  Name : " + name);
	   System.out.println("Employee salary : " + salary);
   
   } 
}
public class EmpDetailsPOJO
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 // System.out.println("Enter Number of Employee Want :");
	  // int n = sc.nextInt();
	  
	  Employee[] a = new Employee[3];
	  
	 for(int i=0;i<a.length;i++)
	 {   
	      System.out.println("Enter ID : ");
		  int id = sc.nextInt();
		  
		  System.out.println("Enter Name : ");
		  String name = sc.next();
		  
		  System.out.println("Enter Salary :");
		  int salary = sc.nextInt();
		  
		  //a[i] = new Employee(id, name , salary);
	 
	 }
	 System.out.println("--------Employee Details---------");
	 for(int i=0;i<a.length;i++)
	 { 
	    a[i].display();
	 
	 }
    sc.close();
  }

}













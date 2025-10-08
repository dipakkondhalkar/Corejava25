/*WAP to create an Employee class with id, name, and salary,
 store 10 employees in a Vector, and display employees with salary above a given amount.*/
 
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
		 this.name = name;
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
 }
 public class EmpData9
 {
	 public static void main(String[]args)
	 {
	   Vector v = new Vector();
	   Employee []emp = new Employee();
	   
	   for(int i=0;i<emp.length;i++)
	   {
		   System.out.println("Enter ID , Name , Salary ----");
		   int id = sc.nextInt();
		   String name = sc.nextline();
		   int salary = sc.nextInt();
		   emp[i] = new Employee(id,name,salary);
		   v.add(emp[i]);
		  		   
	   }
	   System.out.println("Enter amount:");
	   int amount = sc.nextInt();
	   
	   Iterator i = v.iterator();
	   while(i.hasNext())
	   {
		  Object obj = i.next(); 
		  Employee emp  =(Employee)next();
		  if(emp.getsalary(i) > amount)
		  {
			System.out.printf("%d\t%s\t%d\t",emp.getid(),emp.getname(),emp.getsalary());
		  }
		   
	   } 
	 }
 }
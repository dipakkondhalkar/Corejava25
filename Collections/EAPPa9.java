/*WAP to create an Employee class with id, name, and salary,
 store 10 employees in a Vector, and display employees with salary above a given amount.*/
 
 import java.util.*;
 
 class Employee
 {
	 private int id;
	 private String name;
	 private int salary;
	  
	  public Employee()
	  {}
	 public Employee(int id,String name,int salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
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
 public class EAPPa9
 {
	 public static void main(String[]args)
	 {
       Scanner sc = new Scanner(System.in);
	   Vector v = new Vector();
	   Employee []emp = new Employee[5];
	   
	   for(int i=0;i<emp.length;i++)
	   {
		   
		   System.out.println("Enter ID , Name , Salary ----");
		   int id = sc.nextInt();
		   String name = sc.next();
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
		  Employee e  =(Employee)obj;
		  if(e.getsalary() > amount)
		  {
			System.out.print("\t"+e.getid()+"\t"+e.getname()+"\t"+e.getsalary());
		  }
		   
	   } 
	 }
 }
 ouput:
 1 warning
Enter ID , Name , Salary ----
12
deep
200
Enter ID , Name , Salary ----
11
manish
4000
Enter ID , Name , Salary ----
23
ram
599
Enter ID , Name , Salary ----
3
shyam
7999
Enter ID , Name , Salary ----
23
vihjau
2000
Enter amount:
1000
        11      manish  4000    3       shyam   7999    23      vihjau  2000
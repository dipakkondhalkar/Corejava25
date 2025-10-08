import java.util.*;

class Employee
{
    private int id;
	private String name;
	private int Salary;

    public Employee(int id , String name , int Salary)
	{
		this.id = id;
		this.name = name;
		this.Salary = Salary;
		
	}

void display()
{	
	System.out.println("Id : " + id + " Name :" + name + "Salary :" + Salary);
}	
}

public class Employee1
{
  public static void main(String []args)
  {
      Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Size of Array :");
	  int n = sc.nextInt();
	  
	  Employee[] Array = new Employee[n];
	  
	  for(int i=0;i<n;i++)
	  {
	     System.out.println("Enter ID :");
		 int id = sc.nextInt();
		 
		 System.out.println("Enter Name :");
		 String name = sc.next();
		 
		 System.out.println("Enter Salary :");
		 int Salary = sc.nextInt();
		 
		 Array[i] = new Employee(id, name , Salary);
		 
	  
	  }
	  System.out.println("-------------Employee Details--------------");
	  for(int i=0;i<n;i++)
	  {
	     Array[i].display();
	  }
	   sc.close();
  }
 
}
import java.util.*;

class Employee
{
    private int id;
	private String name;
	private int Salary;

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
	  this.name =name;
	}
	public String getname()
	{
	   return name;
	}
	public void setSalary(int Salary)
	{
	   this.Salary = Salary;
	}
	public int getSalary()
	{
	  return Salary;
	}
	
void display()
{
    System.out.println("Id :" + id);
	System.out.println("Name : " + name);
	System.out.println("Salary :" + Salary);
}
}

public class Employee21
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
	  
	  for(int i=0;i<n;i++)
	  {
	    System.out.println("----------Display Details -------");
         Array[i].display();		
	  }
	   sc.close();
  }
 
}
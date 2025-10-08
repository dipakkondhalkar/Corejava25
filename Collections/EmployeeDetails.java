import java.util.*;

class Employee
{
    private int id;
	private String name;
	private int salary;
	
	public Employee()
	{

	}
	public Employee(int id,String name,int salary)
	{
	  this.id = id;
	  this.name = name;
	  this.salary = salary;
	}
	public void setid(int id)
	{
	   this.id =id;
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
public class EmployeeDetails
{
   public static void main(String[]args)
   {
      Scanner sc= new Scanner(System.in);
	  
	   Vector v = new Vector();
	   Employee []emp = new Employee[2];
	   
	   for(int i=0;i<emp.length;i++)
	   {
	      System.out.println("Enter ID,Name, Salary");
		  int id = sc.nextInt();
		  
		  String name = sc.next();
		  int salary = sc.nextInt();
		  
		  emp[i] = new Employee(id,name,salary);
		  v.add(emp[i]);
		  
		  
	   }
	   Iterator i = v.iterator();
	   while(i.hasNext())
	   {
	       Object obj = i.next();
		   Employee e = (Employee)obj;
		   
		   System.out.println(e.getid() + "  " +  e.getname() + " " +  e.getsalary());
	   }
   }
}
output:
Enter ID,Name, Salary
12
dipak
2000
Enter ID,Name, Salary
23
deep
4000
12  dipak 2000
23  deep 4000  


















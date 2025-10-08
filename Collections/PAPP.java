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
public class PAPP
{
	public static void main(String []args)
	{
		
		
		Employee a[] = new Employee[3];
		
	   System.out.println("Enter Elements in Array : ");
	   
	   for(int i=0;i<a.length;i++)
	   {
		   a[i] = new Employee();
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter ID: ");
		   int id = sc.nextInt();
		   sc.nextLine();
		   System.out.println("Enter Name :");
		   String name = sc.nextLine();
		   
		   System.out.println("Enter Salary :");
		   int salary = sc.nextInt();
		   
		   a[i].setid(id);
		   a[i].setname(name);
		   a[i].setsalary(salary);
	   }
		
		System.out.println("Show the Array :");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i].getid() + "\t" + a[i].getname() + "\t" + a[i].getsalary());
		}
	}
}














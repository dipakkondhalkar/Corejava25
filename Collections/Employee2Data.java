/*Q2. Sort Employees by Salary
Create an Employee class with fields: id, name, salary.
Insert employees into an ArrayList.
Sort by salary (ascending order).
Display top 3 highest paid employees.
Explanation:
 Checks usage of ArrayList with objects, implementing compareTo() based on salary, 
 and list traversal after sorting.*/
 
 import java.util.*;
 
 class Employee implements Comparable
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
	
	public int compareTo(Object o)
	{
		Employee emp = (Employee)o;
		if(this.salary > emp.salary)
		{
			return 1;
		}
		else if(this.salary < emp.salary)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class Employee2Data
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		List list = new ArrayList();
		
		list.add(new Employee(1,"deep ",3000));
	    list.add(new Employee(2,"ram ",5000));
	    list.add(new Employee(3,"rohan ",1000));
	    list.add(new Employee(4,"pranav",2000));
	    list.add(new Employee(5,"vivek",7000));
	    list.add(new Employee(6,"pratik",9000));
	    list.add(new Employee(7,"vijay",12000));
	    list.add(new Employee(8,"ram ",34000));
	    list.add(new Employee(9,"manoj ",4000));
	    list.add(new Employee(12,"nanish",45000));
		
		System.out.println("Employee Salary Before Sorting :");
		for(Object obj:list)
		{
		  Employee emp =(Employee)obj;
		  System.out.println("\t" + emp.getid() + "\t " + emp.getname() + "\t" + emp.getsalary());
		}
		Collections.sort(list);
		
		System.out.println("Employee Salary after Sorting :");
		
		for(Object obj:list)
		{
		  Employee emp =(Employee)obj;
		  System.out.println("\t" + emp.getid() + "\t " + emp.getname() + "\t" + emp.getsalary());
		}
		
		System.out.println("\n Top 3 highest paid employees:");
       for (int i = list.size() - 3; i < list.size(); i++) {  // start from 3rd last element
          Employee emp = (Employee) list.get(i);  // cast Object → Employee
          System.out.println("\t" + emp.getid() + "\t" + emp.getname() + "\t" + emp.getsalary());
     
	   }    
	}
} 
output:
Employee Salary Before Sorting :
        1        deep   3000
        2        ram    5000
        3        rohan  1000
        4        pranav 2000
        5        vivek  7000
        6        pratik 9000
        7        vijay  12000
        8        ram    34000
        9        manoj  4000
        12       nanish 45000
Employee Salary after Sorting :
        3        rohan  1000
        4        pranav 2000
        1        deep   3000
        9        manoj  4000
        2        ram    5000
        5        vivek  7000
        6        pratik 9000
        7        vijay  12000
        8        ram    34000
        12       nanish 45000

Top 3 highest paid employees:
        7       vijay   12000
        8       ram     34000
        12      nanish  45000

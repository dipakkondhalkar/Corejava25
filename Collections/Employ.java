/*Q1. Employee Management (Add & Display Employees)
👉 Create a Employee POJO class with fields: id, name, salary.
 👉 In the main class, use an ArrayList<Employee> to:
Add at least 5 employees.
Display all employees.
Explanation:
 Tests how to create a POJO, store objects in ArrayList, and iterate over them using loops.*/
 
import java.util.*;
class Employee1
{
  private int id;
  private String  name;
  private int salary;
  
  public Employee1(int id,String name, int salary)
  {
     this.id = id;
	 this.name = name;
	 this.salary = salary;
  
  }
  
  public int getid()
  {
    return id;
  }
  public String getname()
  {
     return name;
  }
  public int getsalary()
  {
    return salary;
  }
 
}
public class Employ
{
 public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in);
	
	ArrayList<Employee1> employee = new ArrayList<>();
	
	employee.add(new Employee1(101,"dip",2000));
	employee.add(new Employee1(102,"dayp",9000));
	employee.add(new Employee1(104,"deep",3000));
	employee.add(new Employee1(106,"dwe",5000));
	employee.add(new Employee1(107,"ddfg",6000));
	employee.add(new Employee1(108,"dsdf",8000));
	
	System.out.println("All EmployeeS :");
	
	for(Employee1 emp : employee)
	{
	    System.out.println(emp.getid()+" " + emp.getname() +" " + emp.getsalary());
	
	}
 }
}
output:
All EmployeeS :
101 dip 2000
102 dayp 9000
104 deep 3000
106 dwe 5000
107 ddfg 6000
108 dsdf 8000 

/*Q6. Sort Employees by Name
Create an Employee class with fields: id, name, and department.
Store employees in an ArrayList.
Sort them alphabetically by name.
 Explanation: Useful for practicing string sorting using compareTo().
*/

import java.util.*;
class Employee implements Comparable<Employee>
{
   private int id;
   private String name;
   private String department;
   
   public Employee(int id,String name,String department)
   {
      this.id =id;
	  this.name = name;
	  this.department = department;
   }
   public int getid()
   {
      return id;
   }
   
   public String getname()
   {
      return name;
   }
   public String getdepartment()
   {
      return department;
   }
   public int compareTo(Employee e)
   {
	   return this.name.compareToIgnoreCase(e.name);
	   
   }
   public String toString()
   {
	   
     return "Id: " + id + "Name: " + name + "Department : " + department;
   }
   
}
public class EmployeeAPP
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 ArrayList<Employee> al = new ArrayList<>();
	
	System.out.println("Enter Number of Employee :");
	int n = sc.nextInt();
     for(int i=0;i<n;i++)
      {
	    System.out.println("Enter details : ");
		System.out.println("Enter Id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name :");
		String name  = sc.next();
		System.out.println("Enter Department :");
		String department = sc.next();
		
		al.add(new Employee(id,name,department));
	  }   
	  
	  Collections.sort(al);
	  System.out.println("Employees After Sorting By Name : ");
	  
	  for(Employee emp : al)
	  {
		  
		  System.out.println(emp);
	  }		  
  }
}

/*
output:
Enter Number of Employee :
3
Enter details :
Enter Id :
12
Enter Name :
dipak
Enter Department :
comp
Enter details :
Enter Id :
23
Enter Name :
ajay
Enter Department :
it
Enter details :
Enter Id :
14
Enter Name :
vijay
Enter Department :
mechanical
Employees After Sorting By Name :
Id: 23Name: ajayDepartment : it
Id: 12Name: dipakDepartment : comp
Id: 14Name: vijayDepartment : mechanical*/








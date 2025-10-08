//Array of Object with User And for Loop.
import java.util.*;

class Employee
{
    private int id;
	private String name;
	private int salary;
	
	//Parameterized  Constructor.
	
	Employee(int id, String name, int salary)
    {
	    this.id = id;
        this.name = name;
        this. salary = salary;		
	 }
	
	//To show output on screen.
	void display()
	{
	   System.out.println("ID : " + id + "Name :" + name + "Salary  :" + salary);
	}

}
public class EmpDetails
{
   public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
	 
	  System.out.println("Enter How Many Employee need :");
	  int n = sc.nextInt();
	  // Create Array .
	  Employee[] e = new Employee[n];
	  
	  for(int i=0;i<n;i++)
	  {
	      System.out.println("Enter ID :");
		  int id = sc.nextInt();
		  
		  System.out.println("Enter Name :");
		  String name = sc.next();
		  
		  System.out.println("Enter Salary: ");
		  int salary = sc.nextInt();
		  
		  // Store data in Array.
		  e[i] = new Employee(id, name , salary);
	  }
	  
	  //Display Details.
	  System.out.println("------------Employee Details--------------");
	  for(int i=0;i<n;i++)
	  {
		//Call Method By object .
	    e[i].display();
	  }
	 
   }
 
}
/*10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.
ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.
Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.*/
 
 import java.util.*;
 class Employee
 {
    
	String name;
	double salary;
	
	Employee(String name, double salary)
	{
	  this.name = name;
	  this.salary = salary;
	}
	double calculateBonus()
	{
	   return 0;
	}
 }
  class PermanentEmployee extends Employee
 {
     PermanentEmployee(String name, double salary)
	 {
	    super(name, salary);
	 }
	 double calculateBonus()
	 {
	    salary = salary +(salary * 0.25);
		return salary;
	 }
 }
 class ContractEmployee extends Employee
 {
     ContractEmployee(String name, double salary)
	 {
	    super(name, salary);
	 }
	 double calculateBonus()
	 {
	    salary = salary +(salary * 0.10);
		return salary;
	 }
 }
 
 
 
 public class SalaryBonus
 {
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  System.out.println("---------Permanent Employee Details----------- ");
	  System.out.println("Name :");
	  String name = sc.next();
	  
	  System.out.println("Salary :");
	  double salary = sc.nextDouble();
	  
	PermanentEmployee p1 = new PermanentEmployee(name,salary);
    double result = p1.calculateBonus();
    System.out.println("Permanent Employee Salary After 25% bonus  : "+ result);
	
	System.out.println("---------Contract Employee Details----------- ");
	  System.out.println("Name :");
	 name = sc.next();
	  
	  System.out.println("Salary :");
	 salary = sc.nextDouble();
	  
	ContractEmployee p2 = new ContractEmployee(name,salary);
    result = p2.calculateBonus();
    System.out.println("Permanent Employee Salary After 10% bonus  : "+ result);
	  
   }
 }
 /*
 output:---------Permanent Employee Details-----------
Name :
dipak
Salary :
1000
Permanent Employee Salary After 25% bonus  : 1250.0
---------Contract Employee Details-----------
Name :
deep
Salary :
5000
Permanent Employee Salary After 10% bonus  : 5500.0
*/
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

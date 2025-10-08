/*Q.2
Create a base class Customer with name and unitsConsumed.
Create a subclass Bill that calculates the electricity bill using this logic:
Units <= 100  → ₹5/unit  
Units <= 200  → ₹6/unit  
Above 200     → ₹7/unit
Output: Customer name, units, and total bill. */

import java.util.*;
class Bill
{  int x;
   void setValue(int x)
   {
      this.x = x;
   }
}
class B extends Bill
{   double total=0;
   void getB()
	{
	   if(x<=100)
	   {
	      total = x * 5; 
	   }
	   else if(x<=200 )
	   {
	     total = x*6;
	   }
	   else
	   {
	     total = x*7;
	   }
	 System.out.println("Total Amount : " + total );
	}	
}

public class Customer
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Name :");
	 String name = sc.nextLine();
	 
	 System.out.println("Enter Unit :");
	 int x = sc.nextInt();
	 
	B  s1 = new B();
	s1.setValue(x);
	s1.getB();

  }
}
  /*
output:
Enter Name :
a109
Enter Unit :
109
Total Amount : 654.0*/
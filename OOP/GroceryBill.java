/*🔸Question 4: Grocery Billing System – Apply Discount Based on Customer Type
Description:
Create a class Customer with fields name and totalBill.
 Then create 3 customer types by extending it: RegularCustomer,PremiumCustomer, and NewCustomer.
Each should override a method applyDiscount() which deducts a discount from the bill:
Regular: 5%
Premium: 15%
New: No discount
Task:
Create an array of different customer objects. 
Apply discount and print final bill for each.
Objective:
Use runtime polymorphism with inheritance, without involving interfaces or enums */

import java.util.*;

class Customer
{
    String name;
	double totalBill;
	
	Customer(String name,double totalBill)
	{
	   this.name = name;
	   this.totalBill = totalBill;
	}
	double applyDiscount()
	{
	  return 0;
	}
}
class RegularCustomer extends Customer
{
   RegularCustomer(String name,double totalBill)
   {
      super(name,totalBill);  
   }
   double applyDiscount()
   {
       return totalBill - (totalBill * 0.05);
	   
   }
 
}
class PremiumCustomer extends Customer
{
   PremiumCustomer(String name, double totalBill)
   {
      super(name, totalBill);
   }
   double applyDiscount()
   {
      return totalBill - (totalBill * 0.15);
   }
}
class newCustomer extends Customer
{
   newCustomer(String name, double totalBill)
   {
      super(name, totalBill);
    }
	double applyDiscount()
	{
	   return 0.0;
	 }
}
class BillGernerate
{
	  void Bill(Customer []c)
	  {
		  for(int i=0;i<c.length;i++)
		  {
			  
			  System.out.println("Name : " + c[i].name + " Total Bill : " + c[i].totalBill + " Discuount is : " + c[i].applyDiscount());
		  }
		  
	  }
   
}
public class GroceryBill
{
   public static void main(String[]args)
   {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Number Customer Want : " );
	   int n = sc.nextInt();
	   
	   Customer[] cus = new Customer[n];
	   
	   BillGenerate obj = new BillGenerate();
	   
	   for(int i=0;i<cus.length;i++)
	   {
                 System.out.println(" 1. Regular Discount --Regular Discount 5% ");
                 System.out.println(" 2. Premium Dicount --Premium Discount 15%");
                 System.out.println(" 3. New Customer --No Discount. ");
                 int choice = sc.nextInt();

                  System.out.println("Enter Customer Name :");
                  String name = sc.next();

                  System.out.println("Enter Bill  :");
                  double bill = sc.nextDouble();

              switch(choice)
			  {
				  case 1:
				   cus[i] = new RegularCustomer(name,bill);
				   
				   break;
				   
				   case 2 :
				     cus[i] = new PremiumCustomer(name, bill);
					 
					 break;
					 
					case 3:
					cus[i] = new newCustomer(name, bill);
					
					break;		  
			  }			 
	   }   	   
	   obj.generateBill(cus); 
   }
}



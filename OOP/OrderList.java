/*5. Question:
 Create a base class Order with orderId, customerName, amount.
 Child classes:
DineInOrder → service charge = 10%.
TakeAwayOrder → packing fee = ₹50.
 Print final bill of each order.
Concepts Tested: Overridden bill calculation, parent reference to call child methods.*/

import java.util.*;

class Order
{
    int id;
    String name;
    double amount;

   Order(int id, String name, double amount)
   {
      this.id = id;
	  this.name = name;
	  this.amount = amount;
   } 
   double calculate()
   {
      return amount;
   }   
}
class DineInOrder extends Order
{
     DineInOrder(int id,String name, double amount)
	 {
	    super(id,name,amount);
	 }
	 double calculate()
	 {   
	   double total = amount + (amount * 0.10);
	     return total;
	 }
}
class TakeAwayOrder extends Order
{
   TakeAwayOrder(int id, String name,double amount)
   {
      super(id,name,amount);
	 
   }
   double calculate()
   {
	 double total = amount + 50;
      return total;
   }
}
public class OrderList
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("-----CUSTOMER Details-------");
	 System.out.println("DineInOrder-------");
	 System.out.println("Enter ID :");
	 int id = sc.nextInt();
	 System.out.println("Enter Name :");
	 String name  = sc.next(); 
	 System.out.println("Enter Amount :");
	 double Amount = sc.nextDouble();
	 
	 Order d1 = new DineInOrder(id,name,Amount);
	 double resut1 = d1.calculate();
	 System.out.println("Service Charge  :" + resut1);
	 
	 System.out.println("DineInOrder----"); 
	 System.out.println("Enter ID :");
	  id = sc.nextInt();
	 System.out.println("Enter Name :");
	  name  = sc.next();
	 System.out.println("Enter Amount :");
	  Amount = sc.nextDouble();
	  
	 Order d2 = new TakeAwayOrder(id,name,Amount);
      double result = d2.calculate();
	  System.out.println("The Packing Fee is : "+ result);
  }
  
}













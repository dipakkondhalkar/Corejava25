/*6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.
Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.
Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses. */
 
import java.util.*;

class Order
{
    int id;
	double amount;
	
	void setValue(int id, double amount)
	{
		this.id = id;
		this.amount = amount;
		
	}
	void calculations()//Overriding Method....
	{
		System.out.println(" ");
	}
	
} 
class CODOrder extends Order
{
   void calculations()
	{
		amount  = amount + 50;
		System.out.println("Delivery Charge with Amount :" + amount);
	}
	
}
class OnlinePaymentOrder extends Order
{
   void calculations()
	{
		amount  = amount - (amount * 0.05);
		System.out.println("Delivery Charge with CASH back 5%  : " + amount);
	}
}

public class deliveryOrder
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("---------Order Details--------");
	  System.out.println("Enter ID : ");
	  int id = sc.nextInt();
	  System.out.println("Enter Amount : ");
	  double  amount = sc.nextDouble();
	  
	  CODOrder d1 = new CODOrder();
	  d1.setValue(id,amount);
      d1.calculations();
	  
	  
	  System.out.println("---------Online Payment Order Details--------");
	  System.out.println("Enter ID : ");
	  id = sc.nextInt(); 
	  System.out.println("Enter Amount : ");
	  amount = sc.nextDouble();
	  
	 OnlinePaymentOrder d2 = new OnlinePaymentOrder();
	  d2.setValue(id,amount);
	  d2.calculations();
   }
}
/*
output:
---------Order Details--------
Enter ID :
23122232
Enter Amount :
100
Delivery Charge with Amount :150.0
---------Online Payment Order Details--------
Enter ID :
223321
Enter Amount :
100
Delivery Charge with CASH back 5%  : 95.0 */
/*Question 1: Online Order System – Payment Mode at Runtime
Description:
Create a class Order that has a method to calculate and print the total price of an order.
 Create separate classes CashPayment, CardPayment, and OnlineWalletPayment with a method pay(double amount).
Requirements:
Pass the payment object to the Order class during object creation.
Based on the payment object passed, Order should call the correct pay() method,
 without knowing which class it is.
Objective:
Simulate loose coupling (via composition) and dynamic polymorphism (via method overriding).
*/

import java.util.*;

class Payment
{
    void pay(double amount)
	{
	   System.out.println("Payment " + amount);
	}
 }
class CashPayment extends Payment
{
    void pay(double amount)
	{
		 System.out.println("Cash payment Successfull ---- " + amount);
	    double dic = (amount > 1000) ? amount -(amount * 0.05) : 0 ;
		System.out.println("-------Cash payment is more than 1000 then discount 5%-------------");
		System.out.println("Card Payment Discount :" + dic);
		
	  
	}
}
class CardPayment extends Payment
{
      void pay(double amount)
	  {
	      System.out.println("Card payment Successfull --- " + amount);
		  double dic = (amount>2000)? amount - (amount * 0.07): 0.0;
		  System.out.println("-----Card Payment is more than 200 then Discount 7%-------");
		  System.out.println("Discount On Order 7%  : " + dic);
		  
	   
	  }
}
class OnlineWalletPayment extends Payment
{

     void pay(double amount)
	 {
	    System.out.println("online Payment Successfull --- "+ amount);
		double dic = (amount>5000)? amount-(amount* 0.10) : 0.0;
		System.out.println("-----Online Payment is more than 5000 then discount of 10%----");
        System.out.println("Discount on Online order 10% :" + dic);		
	  }

}

class order
{
    void calculate(Payment p, double amount)
	{
	   p.pay(amount);
	}
}

public class OrderApp
{
    public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		
		order s1 = new order();
		
		boolean running = true;
		while(true)
		{   
	        System.out.println("\n-------------------------------------------\n");
	        System.out.println("Enter Choice :");
			System.out.println("1.Cash Payment");
			System.out.println("2.Card Payment ");
			System.out.println("3.Online Wallet Payment");
			System.out.println("4.Exit ");
			
			System.out.println("Enter Choice :");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
		    System.out.println("Enter Amount for Cash Payment :");
			double amt1 = sc.nextDouble();
			s1.calculate(new CashPayment(),amt1);
			break;
			
			case 2:
			
			System.out.println("Enter Amount for Card Payment ");
			double amt2 = sc.nextDouble();
			s1.calculate(new CardPayment(),amt2);
			break;
			
			
			case 3:
			
			System.out.println("Enter Amount for online wallet payment :");
			double amt3 = sc.nextDouble();
			s1.calculate(new OnlineWalletPayment(),amt3);
			
			break;
			
			case  4:
			  
		    System.out.println("Exiting loop....");
            running  = false;
            break;			
		
			default:
			
			System.out.println("Invalid Input ....");
			 break;
			 
		  }
		  
		  if(choice ==  4)
		  {
			  
			  break;
		  }
		}	
	}
}
/*
output:
-------------------------------------------

Enter Choice :
1.Cash Payment
2.Card Payment
3.Online Wallet Payment
4.Exit
Enter Choice :
1
Enter Amount for Cash Payment :
20000
Cash payment Successfull ---- 20000.0
-------Cash payment is more than 1000 then discount 5%-------------
Card Payment Discount :19000.0

-------------------------------------------

Enter Choice :
1.Cash Payment
2.Card Payment
3.Online Wallet Payment
4.Exit
Enter Choice :
2
Enter Amount for Card Payment
4000
Card payment Successfull --- 4000.0
-----Card Payment is more than 200 then Discount 7%-------
Discount On Order 7%  : 3720.0

-------------------------------------------

Enter Choice :
1.Cash Payment
2.Card Payment
3.Online Wallet Payment
4.Exit
Enter Choice :
3
Enter Amount for online wallet payment :
40000
online Payment Successfull --- 40000.0
-----Online Payment is more than 5000 then discount of 10%----
Discount on Online order 10% :36000.0

-------------------------------------------

Enter Choice :
1.Cash Payment
2.Card Payment
3.Online Wallet Payment
4.Exit
Enter Choice :
4
Exiting loop....  */
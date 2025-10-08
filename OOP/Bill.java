/*5. Problem:
 Create a class BillGenerator with overloaded generateBill methods to:
Generate bill with base price only
Generate bill with base price and tax
Generate bill with base price, tax, and discount
Expected Overloads:
double generateBill(double price);
double generateBill(double price, double tax);
double generateBill(double price, double tax, double discount */

import java.util.*;
class BillGenrator
{
   double generateBill(double price)
    {
	  return price;
	}
	double generateBill(double price, double tax)
	{
	   return price + (price * tax)/100;
	
	}
	double generateBill(double price, double tax,double discount)
	{
	   double pricetax = price +(price * tax)/100;
	   double pricediscount = pricetax -(discount * pricetax)/100;
	   return pricediscount;
	}
}

public class Bill
{
	public static void main(String[]args)
    {
		Scanner sc = new Scanner(System.in);
		
		BillGenrator  b1 = new BillGenrator();
		
		System.out.println("Enter Price  : ");
		int price = sc.nextInt();
		
		System.out.println("Base Pay : " + b1.generateBill(price));
		
		System.out.println("Enter Tax Amounnt");
		int tax = sc.nextInt();
		System.out.println("Total Tax: " + b1.generateBill(price,tax) );
		
		
		System.out.println("Enter Discount Amount :");
		int discount = sc.nextInt();
		System.out.println("Total Discount : " + b1.generateBill(price, tax ,discount));
	}	
}













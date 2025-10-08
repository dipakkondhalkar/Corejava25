/*Q6. Create a Java program with a default constructor for Shop Management (productName, price, quantitySold).
 Operations:
Calculate total sales = price × quantitySold.
Apply 5% discount if totalSales > 20,000.
Add 12% GST after discount.
Display final bill. */

import java.util.*;

class Shop
{
    String name;
	int price;
	int qSold;
	
	Shop()
	{
	   
	   Scanner sc= new Scanner();
	   
	   System.out.println("----Enter the Product Detais----");
	   System.out.println("Enter Name of Product ");
	   name =sc.nextLine();
	   
	   sc.nextLine();
	   
	   System.out.println("Enter Price ");
	   price = sc.nextInt();
	   
	   System.out.println("Enter");
	   qsold = sc.nextInt();
	   
	   int sales = price * qsold;
	   System.out.println("Total Sales " + sales );
	   
	   double discount = 0;
	   if(sale > 20000)
	       {
	       discount = sales * 0.05;
		   sales = sales - discount;
		   System.out.println(" After Discount " + discount);
	       }
	        
	   else
	      { 
           System.out.println("No Discount ");	   
	      }
	    double gst = sales * 0.12;
		double totalBill = sales + gst;
		
		System.out.println(" The Bill After 12 % GST  : " + gst);
        System.out.println("Total Bill is  " + totalBill);
		 
	}
}
public class ShopProduct {
public static void main(String []args)
{
   new Shop();

   }
}













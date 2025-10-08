/*Q4. Question:
 Create a Java class Product with constructor overloading:
First constructor takes productId, productName, and price.
Second constructor takes productId, productName, price, and discountPercent.
Perform the following:
If discount is provided, calculate final price = price - (price × discount/100).
If no discount is provided, keep price as is.
If price > 5000, apply an extra 5% discount automatically.
Explanation:
 This question checks constructor overloading, percentage calculations, and nested logical operations in the constructor.*/
 
 import java.util.*;
 
 class product
 {
       int id;
	   String name;
       double price;
	   int discount;
	   
	   //first Contructor.
	   product(int id, String name, double price)
	   {
	     this.id = id;
         this.name = name;
         this.price  = price;		 
	  
	  if(price > 5000)
	    {
		  this.price = price - (price * 5/100);
	    }
	   }
	   
	   //Second Contructor.
	   product(int id, String name , double price , int discount )
	   {
		 this.id = id;
         this.name = name;
         this.price = price;
         this.discount = discount;	

         double discountPrice = price -(price * discount/100);
 
         if(discountPrice >5000)
		 {
			 discountPrice = discountPrice -(discountPrice * 5/100);
		 }	
          this.price = discountPrice;		 
	   }	   
	   
	
	   
	  void display()
	   {
		   System.out.println("ID : " + id);
		   System.out.println("Name :" + name);
		   System.out.println("Price :" + price);
		   System.out.println("Discount :" + discount + "%");
		      
	   }
	  
  }
public class ProductDetails
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Product Details");
	  
	  System.out.println("Ente id :");
	  int id = sc.nextInt();
	  sc.nextLine();
	  
	  
	  System.out.println("Enter Name :");
	  String name = sc.nextLine();
	  
	  
	  System.out.println("Enter Price :");
	  double price = sc.nextDouble();
	  
	  System.out.println("Enter Discount :");
	  int discount = sc.nextInt();
	 
	  
	  product p = new product(id,name , price, discount);
	  p.display();
   }
}
/*4. Problem:
Create a Product class with fields (productId, productName, price). 
Create an array of 5 product objects and do the following:
Accept product details.
If the price is more than ₹1000, apply a 15% discount.
Display product name, original price, discounted price.
Explanation:
This question teaches how to apply business logic (discount calculation) using class fields
 and basic arithmetic without using constructors. */
 
 import java.util.*;
 
 class Product
 {
   private int id;
   private String name;
   private int price;
   private double disPrice;
   
   public void setid(int id)
   {
     this.id = id;
   }
   public int getid()
   {  
     return id;
   }
   public void setname(String name)
   {
     this.name = name;
   }
   public String getname()
   {
      return name;
   }
   public void setprice(int price)
   {
      this.price = price;
   }
   
   void calculate()
   {
      if(price > 1000)
	  {
	    disPrice = price - price * 0.15;
	  }
	  else
	  {
		  disPrice = price;
	  }
   }
   void display()
   {
      System.out.println("Id : " + id);
	  System.out.println("Name : " + name);
	  System.out.println("Price :" + price);
	  System.out.println("After Discount  :" + disPrice);
	  System.out.println("-----------------------");
	  
   }
 
 }

public class ProductShop
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	
	Product[] pro = new Product[3];
	
	
	for(int i=0;i<pro.length;i++)
	{
	   pro[i] = new Product();
      System.out.println("Enter Product Details");
      System.out.println("Enter Id :");
      pro[i].setid(sc.nextInt());

      sc.nextLine();

      System.out.println("Enter Name :");
      pro[i].setname(sc.nextLine());

      System.out.println("Enter Price:");
      pro[i].setprice(sc.nextInt());

	 
	}
	for(int i=0;i<pro.length;i++)
	{
	   pro[i].calculate();
	   pro[i].display();
	}
  }
   
}
/*
output:
Enter Product Details
Enter Id :
1
Enter Name :
dipak
Enter Price:
1000
Enter Product Details
Enter Id :
2
Enter Name :
enter
Enter Price:
3000
Enter Product Details
Enter Id :
3
Enter Name :
vijau
Enter Price:
100
Id : 1
Name : dipak
Price :1000
After Discount  :1000.0
-----------------------
Id : 2
Name : enter
Price :3000
After Discount  :2550.0
-----------------------
Id : 3
Name : vijau
Price :100
After Discount  :100.0
----------------------- */















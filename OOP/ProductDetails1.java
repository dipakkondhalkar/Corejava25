/*1. Question:
 Create a base class Product with id, name, and price.
 Child classes:
GroceryProduct → apply 5% discount.
ElectronicProduct → apply 12% GST.
 Calculate and display the final price for multiple products.
Explanation:
 Tests inheritance with both addition and deduction logic,
 loop with mixed child objects, and overriding methods.*/
 
 
 import java.util.*;
 
 class Product
{
   int id;
   String name;
   double price;

   void setvalue(int id,String name,double price)
   {
       this.id = id;
	   this.name = name;
	   this.price = price;
   }   
   void calculateProduct()
   {
       
   }
}
class GroceryProduct extends Product
{
   GroceryProduct(int id,String name,double price)
   {
       setvalue(id,name,price);
   }
   void calculateProduct()
   {
       price = price + (price * 0.05);
	  System.out.println("After 5% discount Price : " + price);
   } 
}
class ElectronicProduct  extends Product
{
    ElectronicProduct(int id, String name, double price)
	{
	   setvalue(id, name,price);
	}
	void calculateProduct()
	{
	    price = price +(price * 0.12);
	   System.out.println("After 12% GST : "+  price);
	}
}
public class ProductDetails1
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 Product[] product = new Product[2];
	 System.out.println("--------GroceryProduct--------");
	 System.out.println("Enter ID: ");
	 int id = sc.nextInt();
	 System.out.println("Enter Name : ");
	 String name = sc.next();
	 System.out.println("Enter Price :");
	 double price = sc.nextDouble();
	 
	 product[0] = new GroceryProduct(id,name,price);
	 
	 System.out.println("-------ElectronicProduct---------");
	  System.out.println("Enter ID: ");
	 int id1 = sc.nextInt();
	 System.out.println("Enter Name : ");
	String name1 = sc.next();
	 System.out.println("Enter Price :");
	double price1 = sc.nextDouble();
	 
	 product[1] = new ElectronicProduct(id1,name1,price1);
	 
	 for(int i=0;i<product.length;i++)
	 {
	   product[i].calculateProduct();
	 }
  }
}
/*
output:
--------GroceryProduct--------
Enter ID:
121212
Enter Name :
dipak
Enter Price :
200
-------ElectronicProduct---------
Enter ID:
121212
Enter Name :
deep
Enter Price :
300
After 5% discount Price : 210.0
After 12% GST : 336.0  */











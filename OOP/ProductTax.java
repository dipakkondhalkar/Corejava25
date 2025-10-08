/*9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.
EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.
Explanation:
 Tests inheritance where logic changes depending on product type.*/
 
 import java.util.*;
 
 class Product
 {
    int id;
	String name;
	double price;
	
	Product(int id, String name , double price)
	{
	    this.id = id;
		this.name = name;
		this.price = price;
	}
	
	void calculate()     //overiding method.
	{
	   System.out.println(" ");
	}
 }
 class LuxuryProduct extends Product
 {
      //here we are using constructor chaining here.
	  
	  LuxuryProduct(int id, String name , double price)
	  {
	     super(id,name,price);      //using chaining solve.
	  }
      void calculate()
	  {
	      price = price +(price * 0.20);
		 System.out.println("After Tax 20% on luxaries Product : " + price);
	  }
 }
 class EssentialProduct extends Product
 {
    EssentialProduct(int id, String name, double price)
	{
	   super(id, name , price);
	}
	void calculate()
	{
	    price = price + (price * 0.05);
	   System.out.println("After Tax 5% on EssentialProduct : " + price);
	}
 }
 public class ProductTax
 {
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  System.out.println("---------LuxuryProduct-------------");
	  System.out.println("Enter ID: ");
	  int Id =sc.nextInt();
	  
	  System.out.println("Enter Name: ");
	  String name = sc.next();
	  
	  System.out.println("Enter Price : ");
	  double price =  sc.nextDouble();
	  
	  LuxuryProduct s1 = new LuxuryProduct(Id ,name, price);
	  s1.calculate();
	  
	   
	  System.out.println("---------EssentialProduct-------------");
	  System.out.println("Enter ID: ");
	   Id =sc.nextInt();
	  
	  System.out.println("Enter Name: ");
	   name = sc.next();
	  
	  System.out.println("Enter Price : ");
	  price =  sc.nextDouble();
	  
	 EssentialProduct s2 = new EssentialProduct(Id ,name, price);
	  s2.calculate();
	   
   }
 }
 /*
output:
Enter ID:
121212
Enter Name:
dipak
Enter Price :
1000
After Tax 20% on luxaries Product : 1200.0
---------EssentialProduct-------------
Enter ID:
12343434
Enter Name:
deep
Enter Price :
100
After Tax 5% on EssentialProduct : 105.0 */













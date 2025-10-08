/*Q1. Create a Java program with a default constructor that initializes details of a Book (title, price, quantity).
 Perform the following in one program:
Display all book details.
Apply a 10% discount if quantity > 5.
Calculate the total cost after discount.
*/

class book
{
   book()
   {
       String name = "English";
	   int price = 100;
	   int quant = 10;
	   
	   if(quant > 5)
	   {
	      price = price * quant;
		  int dis = price* 10/100;
		  
		  System.out.println("Discount on Book total Book :" + ( price - dis ));
	   }
   }

}
public class BookStore1
{
   public static void main(String []args)
   {
      book a = new book();
   
   }
}  
/*
output:
Discount on Book total Book :900 */
/*


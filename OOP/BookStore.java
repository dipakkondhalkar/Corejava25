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
public class BookStore
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


Q2. Write a Java program with a default constructor to store Student details (rollNo, name, marks in 3 subjects).
 Operations:
Calculate total and average marks.


Display "Pass" if average ≥ 40, else "Fail".


Find and display the highest subject mark. */

import java.util.*;
class  cost
{     
    Scanner sc = new Scanner(System.in);
	int rollNo;
	String name;
	int marks;
	String Subject;
	
	cost()
	 {
		 System.out.println("Enter Roll Nmber :");
		 rollno = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Enter name ");
		 name = sc.nextLine();
		 sc.nextLine();
		 
		 System.out.println("Enter marks");
		 marks = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Enter Subject :");
		 subject = sc.nextLine();
		 
		 int 
		 double average;
		 if(average >= 40 )
		 {
			  System.out.println("Student Pass");
		 }
		 else
		 {
		     System.out.println("Student fail");	 
		 }
		 
	 }	 
	
}
public class Studentdetail
{
	public static void main(String[]args)
	{
	    cost a = new cost();	
	}	
	
}





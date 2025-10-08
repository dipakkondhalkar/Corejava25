/*3. Problem:
Create a Book class with fields (bookId, title, author, price). 
Store information of 6 books using an array of objects. Do the following:
Accept all book details.
Display books where the price is greater than ₹500.
Count and display the number of such books.
Explanation:
Focuses on filtering data from an array of objects based on a condition. 
Practices object creation, input, filtering, and count logic.  */

import java.util.*;

class Book
{
  private int id;
  private String title;
  private String author;
  private int price;
   
   public void setid(int id)
   {
     this.id = id;
   }
   public int getid()
   {
     return id;
   }
   public void settitle(String title)
   {
     this.title = title;
   }
   public String gettitle()
   {
     return title;
   }
   public void setauthor(String author)
   {
     this.author = author;
   }
   public String getauthor()
   {
     return author;
   }
    public void setprice(int price)
   {
     this.price = price;
   }
   public int getprice()
   {
     return price;
   }
   
   void display()
   {
     if(price > 500)
	 {
	  System.out.println("ID" + id);
	  System.out.println("Title " + title);
	  System.out.println("Author :" + author);
	  System.out.println("Price :" + price);
	  System.out.println("-----------------------");
	    
	 }
   }
}
public class BookDetails
{
   public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
	 Book[] books = new Book[5];
	 
	 for(int i=0;i<books.length;i++)
	 {
	   books[i] = new Book();
	   
	   System.out.println("\nEnter Book ID :");
	   books[i].setid(sc.nextInt());
	   sc.nextLine();
	   
	   System.out.println("Enter Title");
	   books[i].settitle(sc.nextLine());
	   
	   System.out.println("Enter Author:");
	   books[i].setauthor(sc.nextLine());
	   
	   System.out.println("Enter Price :");
	   books[i].setprice(sc.nextInt());
	   
	   }
	   
	   System.out.println("\nBooks with Price > 500");
	   
	   int count = 0;
	   for(int i=0;i<books.length;i++)
	   {
	      if(books[i].getprice()>500)
		  {
		    books[i].display();
			count++;
		  }
	   }
	   System.out.println("Number of book with price > 500 :" + count);
	 
   }
}
/*
output:
Enter Book ID :
1
Enter Title
math
Enter Author:
dinesh
Enter Price :
400

Enter Book ID :
2
Enter Title
chem
Enter Author:
ravi
Enter Price :
600

Enter Book ID :
3
Enter Title
evs
Enter Author:
manish
Enter Price :
400

Enter Book ID :
4
Enter Title
phy
Enter Author:
deep
Enter Price :
800

Enter Book ID :
5
Enter Title
bio
Enter Author:
vivek
Enter Price :
200

Books with Price > 500
ID2
Title chem
Author :ravi
Price :600
-----------------------
ID4
Title phy
Author :deep
Price :800
-----------------------
Number of book with price > 500 :2 */





















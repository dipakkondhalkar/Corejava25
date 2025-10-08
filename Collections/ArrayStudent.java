/*Q1. Problem:
Write a Java program using an ArrayList to store student names. Perform the following operations :
Add 7 student names.
Display the list.
Remove a student by name.
Replace the 3rd student with a new name.
Sort the list in ascending order and display it.
Explanation:
Tests add(), remove(), set(), Collections.sort().
Shows how ArrayList maintains insertion order and allows duplicates.
*/

import java.util.*;

public class ArrayStudent
{
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number of Element :");
	   int n = sc.nextInt();
       ArrayList<String> al = new ArrayList<String>();
	   System.out.println("Enter Names :");
       for(int i=0;i<n;i++)
	   {
		   String name = sc.next();
		   al.add(name);
	   }		   
	   System.out.println("Enter Name to Remove :" );
	   String nam1 = sc.next();
	   
	  if(al.contains(nam1))
	  {
		  
		  al.remove(nam1); 
		  System.out.println("Name remove successfully : " + nam1);
	  }
	  else
	  {
		  System.out.println("Please Enter Valid Name.... ");
	  }
	  System.out.println("\n List After Remove : ");
	  System.out.println(al);
	  
	  System.out.println("\nEnter Name to replace to 3 Position : ");
	  String posName = sc.next();
	  
	   al.set(3,posName);
	   System.out.println("\nAfter Replace positon : "+ al);

       Collections.sort(al);
       System.out.println("\nData After sort : " + al);		 
   }
}


output:
Enter Number of Element :
5
Enter Names :
dipaj
deep
pranav
ram
shyam
Enter Name to Remove :
deep
Name remove successfully : deep

 List After Remove :
[dipaj, pranav, ram, shyam]

Enter Name to replace to 3 Position :
vijay

After Replace positon : [dipaj, pranav, ram, vijay]

Data After sort : [dipaj, pranav, ram, vijay]

/*Q2. Problem:
 Use a Vector to store book titles in a library. Perform the following operations:
Insert 6 books.
Display all books.
Search if a specific book exists.
Insert a book at position 2.
Remove the last book and display the final list.
Explanation:
Tests add(), contains(), insertElementAt(), remove().
Demonstrates synchronization feature of Vector (good in multi-threaded context).
*/

import java.util.*;
public class VectorBook
{
  public static void main(String[]args)
  {
	  Scanner sc= new Scanner(System.in);
	  
	  System.out.println("Enter Number of Books : ");
	  int n = sc.nextInt();
	  Vector<String> v = new Vector<String>();
	  
	  System.out.println("Enter Books : ");
	  for(int i=0;i<n;i++)
	  {
		  v.add(sc.next());
	  }
	  System.out.println("Display All Books : " + v);
	  
	  System.out.println("Enter Book to search : " );
	  String search = sc.next();
	  
	  if(v.contains(search))
	  {
		  
		  System.out.println("Books Exist ");
	  }
	  else
	  {
		  System.out.println("Books Not Exist");
	  }
	  System.out.println("Enter Book to change Position at 2 :");
	  String nam1 = sc.next();
	   v.insertElementAt(nam1,2);
	   System.out.println(v);
	  
	  
	   v.removeElementAt(v.size() -1);
	   System.out.println("List after Remove Last Element : " + v);
  }
}
output:
Enter Number of Books :
4
Enter Books :
wewe
to
story
hack
Display All Books : [wewe, toto, story, hack]
Enter Book to search :
wewe
Books Exist
Enter Book to change Position at 2 :
english
[wewe, toto, english, story, hack]
List after Remove Last Element : [wewe, toto, english, story]
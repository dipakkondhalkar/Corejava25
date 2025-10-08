/*Make Use of Generics in each questions
Q.1 Create a LinkedList of integers. Perform the following operations:
Insert 5 numbers from the user.
Delete the 2nd element.
Update the last element with a new value.
Display the list.*/

import java.util.*;
public class GenericsLinkedList
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Number of Elements  : ");
	  int n = sc.nextInt();
	  System.out.println("Enter Elements : " );
	  
	  LinkedList<Integer> list = new LinkedList<>();
	  
	  for(int i=0;i<n;i++)
	    {
		   list.add(sc.nextInt());
		}
		
		//System.out.println("Size after remove");
	  if(list.size()>=2)
	  {
		  list.remove(1);
	  
	  }	
       System.out.println("Enter number to update :");
        int no = sc.nextInt();
		
	  list.add(list.size(),no);
	  System.out.println("List After delete 2nd position and update to last Elements  :");
	  for(Object obj : list)
	  {
		   System.out.println(obj);
	  }
   }
}
/*
output:
Enter Number of Elements  :
4
Enter Elements :
1
2
3
4
Enter number to update :
5
List After delete 2nd position and update to last Elements  :
1
3
4
5*/


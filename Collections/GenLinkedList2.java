/*Q.2
Write a program to merge two LinkedLists (e.g., List A = [1,2,3], List B = [4,5,6] → [1,2,3,4,5,6]).
_______________________________________________________________________________
*/

import java.util.*;

public class GenLinkedList2
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in); 
	 System.out.println("Enter how many number want In First List : ");
	 int A = sc.nextInt();
	 
	 System.out.println("Enter Now Number :");
	  LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<A;i++)
		{
			list.add(sc.nextInt());
		}			
		
	System.out.println("Enter how many number want In Second List : ");
	 int B = sc.nextInt();
	System.out.println("Enter Now Number  : ");
	 LinkedList<Integer> list2 = new LinkedList<>();
        for(int i=0;i<B;i++)
		{
			list2.add(sc.nextInt());
		}			
		
		System.out.println("List After Merge of Two List is :");
		
		LinkedList<Integer> merge = new LinkedList<>();
        
		 merge.addAll(list);
		 merge.addAll(list2);
		 
		 System.out.println("List A : " + list);
		 System.out.println("List B : " + list);
		 System.out.println("List after Merge : " + merge);
  }
}
/*
output:
Enter how many number want In First List :
5
Enter Now Number :
1
2
3
4
5
Enter how many number want In Second List :
5
Enter Now Number  :
6
7
8
9
10
List After Merge of Two List is :
List A  :[1, 2, 3, 4, 5]
List B : [1, 2, 3, 4, 5]
List after Merge : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
*/
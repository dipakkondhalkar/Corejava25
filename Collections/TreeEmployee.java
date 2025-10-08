/*Q4. Problem:
 Use a TreeSet to store unique employee IDs (integers). Perform the following operations:
Add 10 employee IDs.
Display all IDs in sorted order.
Find the smallest and largest ID.
Remove an ID.
Display IDs greater than a given number.
Explanation:
Tests add(), remove(), first(), last(), tailSet().
Shows how TreeSet maintains natural ordering.
*/

import java.util.*;
public class TreeEmployee
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Number OF Employee :");
	int n = sc.nextInt();
	TreeSet<Integer> ts = new TreeSet<>();
	
	System.out.println("Enter Employee : ");
	for(int i=0;i<n;i++)
	{
		ts.add(sc.nextInt());
	}
	System.out.println("Id IN Sorted Order : " + ts);
	
	System.out.println("First Id : " + ts.first());
	System.out.println("Last ID : "+ ts.last());
	
	System.out.println("Enter Number from where to display :");
	  n = sc.nextInt();
	
	Set<Integer> tre = ts.tailSet(n);
	System.out.println("TailSet is : "+ tre);
	
  }
}
output:
Enter Number OF Employee :
5
Enter Employee :
12
23
34
45
56
Id IN Sorted Order : [12, 23, 34, 45, 56]
First Id : 12
Last ID : 56
Enter Number from where to display :
40
TailSet is : [45, 56]

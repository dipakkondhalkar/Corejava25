/*Q9. Problem:
 Store student marks (integers) in a TreeSet. Perform the following operations:
Add 10 marks.
Display all marks in sorted order.
Find the top 3 marks.
Remove the lowest mark.
Display all marks greater than 60.
Explanation:
Tests add(), descendingIterator(), pollFirst(), tailSet().
Demonstrates TreeSet’s automatic sorting + range queries.*/

import java.util.*;
public class StudentTree
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Number OF Student :");
	int n = sc.nextInt();
	TreeSet<Integer> ts = new TreeSet<>();
	
	System.out.println("Enter Student : ");
	for(int i=0;i<n;i++)
	{
		ts.add(sc.nextInt());
	}
	
	Collections.sort(ts);
	System.out.println("Marks in Sorted  : "+ ts);
	
    
   
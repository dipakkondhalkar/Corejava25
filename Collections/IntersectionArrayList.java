/*Q.5
Intersection of Two ArrayLists
Input: [1, 2, 3, 4] and [3, 4, 5, 6] → Output: [3, 4].*/

import java.util.*;
public class IntersectionArrayList
{
  public static void main(String[]args)
  { 
     Scanner sc = new Scanner(System.in);
	 
	 ArrayList<Integer>  list1 = new ArrayList<>();
	 
	 System.out.println("Enter Element Number : ");
	 int n = sc.nextInt();
	 
	 System.out.println("Enter Element :");
	 for(int i=0;i<n;i++)
	 {
	    list1.add(sc.nextInt());
	 }
	 
	  ArrayList<Integer>  list2 = new ArrayList<>();
	 
	 System.out.println("Enter Element Number : ");
	 int n1 = sc.nextInt();
	 
	 System.out.println("Enter Element :");
	 for(int i=0;i<n1;i++)
	 {
	    list2.add(sc.nextInt());
	 }
	 
	  ArrayList<Integer>  intersection = new ArrayList<>();
	 
	  for(Integer val : list1)
	  {
	    if(list2.contains(val) && !intersection.contains(val))
		{
		    intersection.add(val);
			
		}
	  }
	  System.out.println("Intersection is  : "+ intersection);
	 
  }
}
/*
output:
Enter Element Number :
5
Enter Element :
1
2
2
3
4
Enter Element Number :
5
Enter Element :
12
1
2
3
3
Intersection is  : [1, 2, 3] */

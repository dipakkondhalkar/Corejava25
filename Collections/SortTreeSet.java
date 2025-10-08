/*8)TreeSet Sorting
Create a TreeSet of integers and add numbers in random order. Show how it automatically sorts elements.*/

import java.util.*;
public class SortTreeSet
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
   TreeSet<Integer> hs = new TreeSet<Integer>();
   
   System.out.println("Enter Number of Elements :");
   int n = sc.nextInt();
   
  System.out.println("Enter Elements in HashSet : ");
  for(int i=0;i<n;i++)
  {
     hs.add(sc.nextInt());
  }
  
  System.out.println("SORT elements in treeset: " );
  for(Integer val : hs)
  {
    
	System.out.println(val);
  }
  }
  }
  output:
  Enter Number of Elements :
6
Enter Elements in HashSet :
23
34
12
34
56
76
SORT elements in treeset:
12
23
34
56
76
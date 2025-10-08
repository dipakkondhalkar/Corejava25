/*4)Iterate a HashSet
Create a HashSet of integers and iterate over it using
Enhanced for loop Iterator*/

import java.util.*;
public class IterateHashSet
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
   HashSet<Integer> hs = new HashSet<Integer>();
   
   System.out.println("Enter Number of Elements :");
   int n = sc.nextInt();
   
  System.out.println("Enter Elements in HashSet : ");
  for(int i=0;i<n;i++)
  {
     hs.add(sc.nextInt());
  }
  
  System.out.println("After Iterate : ");
 
 for(Integer val : hs)
  {
	   System.out.println(val);
   }
  }
}
output:Enter Number of Elements :
5
Enter Elements in HashSet :
1
2
1
2
3
After Iterate :
1
2
3
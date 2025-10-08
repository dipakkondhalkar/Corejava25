/*3)Remove Element
Add 5 elements to a HashSet. Remove one element using remove() and print the set.*/

import java.util.*;
public class RemvoveHashset
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
  
  System.out.println("Enter Element to remove :");
  int rm = sc.nextInt();
  
  if(hs.contains(rm))
  {
     hs.remove(rm);
  }
  else
  {
     System.out.println("Element not found " );
	 
   }
   System.out.println("After remove of element Hashset");
   for(Integer in : hs)
   {
	   System.out.println(in);
   }
    }
  }
  output:
  Enter Number of Elements :
5
Enter Elements in HashSet :
1
2
3
4
5
Enter Element to remove :
3
After remove of element Hashset
1
2
4
5


/*7)Clear a Set
Create a HashSet of 5 numbers. Clear the set using clear() and check if it’s empty using isEmpty().*/

import java.util.*;
public class EmptyClearCheck
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
   System.out.println("Original hashset .."+  hs);

   hs.clear();
   
    boolean b = hs.isEmpty();
	
	if(b)
	{
		
		System.out.println("Hashset is Empty");
	}
	else
	{
		System.out.println("Hashset is not empty ");
	}
  }
  }
  output:
  Enter Number of Elements :
5
Enter Elements in HashSet :
1
2
2
3
4
Original hashset ..[1, 2, 3, 4]
Hashset is Empty
  
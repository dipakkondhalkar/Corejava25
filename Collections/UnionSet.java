/*10)Union of Two Sets
Create two HashSets of integers. Add some elements in both. Perform union using addAll() and print the result.*/

import java.util.*;
public class UnionSet
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
   HashSet<Integer> hs1 = new HashSet<Integer>();
   
   System.out.println("Enter Number of Elements :");
   int n = sc.nextInt();
   
  System.out.println("Enter Elements in HashSet A : ");
  for(int i=0;i<n;i++)
  {
     hs1.add(sc.nextInt());
  }
  
  
   HashSet<Integer> hs2 = new HashSet<Integer>();
   
   System.out.println("Enter Number of Elements :");
   int n1 = sc.nextInt();
   
  System.out.println("Enter Elements in HashSet B : ");
  for(int i=0;i<n1;i++)
  {
     hs2.add(sc.nextInt());
  }
  
  HashSet<Integer> UNION = new HashSet<Integer>();
   
  
  UNION.addAll(hs1);
  UNION.addAll(hs2);
  
  System.out.println("UNION SET : ");
  for(Integer val : UNION)
  {
     System.out.println(val);
  }
  }
  }
output:
Enter Number of Elements :
5
Enter Elements in HashSet A :
1
2
3
4
5
Enter Number of Elements :
5
Enter Elements in HashSet B :
2
3
5
6
7
UNION SET :
1
2
3
4
5
6
7
  
/*Q.3
Merge Two ArrayLists
Merge ArrayList<Integer> A and B into one sorted list.*/

import java.util.*;
public class MergeArrayList
{
  public static void main(String[]args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Element :");
  int n = sc.nextInt();
  
  ArrayList<Integer>  al = new ArrayList<>();
  System.out.println("Enter Element In  ArrayList A :");
  
  for(int i=0;i<n;i++)
  {
     al.add(sc.nextInt());
  }
  
  
 
  System.out.println("Enter Element :");
  int n1 = sc.nextInt();
  
  ArrayList<Integer>  al2 = new ArrayList<>();
  System.out.println(" Enter Element In  ArrayList B : ");
  
  for(int i=0;i<n1;i++)
  {
     al2.add(sc.nextInt());
  }
  
   ArrayList<Integer>  merge = new ArrayList<>();
   merge.addAll(al);
   merge.addAll(al2);
   
   Collections.sort(merge);
   
   System.out.println("Merge of Two Array  : ");
   for(Integer val : merge)
   {
     
	 System.out.println(val);
   }
  }
}

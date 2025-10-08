/*1)Create a HashSet
Write a Java program to create a HashSet of integers and add 5 numbers to it. Then print all elements.
*/

import java.util.*;
public class HashSet1
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
   HashSet<Integer> hs = new HashSet<Integer>();
   
   System.out.println("Enter Number of Elements :");
   int n = sc.nextInt();
   
  System.out.println("Enter Elements in HashSet : ");
  for(int i=0;i<=n;i++)
  {
     hs.add(sc.nextInt());
  }
  
  System.out.println("Elements in hashSet : ");
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
12
11
34
23
12
Elements in hashSet :
34
23
11
12

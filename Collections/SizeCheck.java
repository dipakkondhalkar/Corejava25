/*6)Find Size of Set
Create a HashSet of integers and print its size using size() method.*/

import java.util.*;
public class SizeCheck
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
  
  System.out.println("Size of Hahset is :");
  System.out.println(hs.size());
  
  }
  }
output:
Enter Number of Elements :
5
Enter Elements in HashSet :
1
2
1
2
3
Size of Hahset is :
3

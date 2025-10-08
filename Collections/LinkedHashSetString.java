/*9)LinkedHashSet Example
Create a LinkedHashSet of Strings and add elements in random order. Show how insertion order is maintained.*/

import java.util.*;
public class LinkedHashSetString
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
   LinkedHashSet<String> ls = new LinkedHashSet<String>();
   
   System.out.println("Enter Number of Elements :");
   int n = sc.nextInt();
   
  System.out.println("Enter Elements in HashSet : ");
  for(int i=0;i<n;i++)
  {
     ls.add(sc.next());
  }
  System.out.println("Elments in insertion order :"+ ls);
  }
  }
  
 output:
Enter Number of Elements :
5
Enter Elements in HashSet :
deep
deep
dip
ram
onkar
Elments in insertion order :[deep, dip, ram, onkar] 
 


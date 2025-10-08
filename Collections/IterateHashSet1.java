/*5)Convert Array to Set
Convert an array of strings to a Set and print unique element.*/

import java.util.*;
public class IterateHashSet1
{
 public static void main(String[]args)
 {
   Scanner sc = new Scanner(System.in);
  
   System.out.println("Enter Number of Names :");
   int n = sc.nextInt();
   ArrayList<String> al = new ArrayList<String>();
   System.out.println("Enter Name  : ");

   for(int i=0;i<n;i++)
   {
     String name = sc.next();
	 al.add(name);
   }
   System.out.println("Names Unique in Set : ");
   
   HashSet<String> hs = new HashSet<>(al);
   
   System.out.println(hs);
   
    }
   }
   
 output:
Enter Number of Names :
5
Enter Name  :
ram
ram
onkar
dipak
deep
Names Unique in Set :
[onkar, deep, dipak, ram]


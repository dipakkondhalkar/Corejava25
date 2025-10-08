/*2)Check if Element Exists
Create a HashSet of Strings. Add some names and check if a particular name exists using contains().*/

import java.util.*;
public class CheckName
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
    HashSet<String> hs = new HashSet<>();
   
    System.out.println("Enter Number of NAME  :");
    int n = sc.nextInt();
   
    System.out.println("Enter NAMES in HashSet : ");
    for(int i=0;i<n;i++)
   {
      hs.add(sc.next());
   }
   
   System.out.println("Enter Name TO Search : ");
    String search = sc.next();
     
	 boolean b = hs.contains(search);
	 
	 if(b)
	 {
	    System.out.println("Name Exists in HashSET ");
		
	 }
	 else
	 {
	   System.out.println("No Name not found  ");
	 }
  } 
}
output:
Enter Number of NAME  :
5
Enter NAMES in HashSet :
onkar
dipak
deep
manish
ram
Enter Name TO Search :
onkar
Name Exists in HashSET 

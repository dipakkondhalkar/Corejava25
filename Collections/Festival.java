/*Q. Problem:
 Use a LinkedHashSet<String> to store festival names. Perform the following operations:
Add 7 festival names (include at least 2 duplicates).
Display festivals in insertion order.
Remove one festival.
Check if "Diwali" exists.
Convert the LinkedHashSet to an ArrayList and sort alphabetically.
Explanation:
Tests add(), remove(), contains(), conversion between collections.
Shows LinkedHashSet keeps insertion order unlike HashSet.
*/
import java.util.*;

public class Festival
{
 public static void main(String[]args)
 {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Number of Festival :");
	   int n = sc.nextInt();
       LinkedHashSet<String> ln = new LinkedHashSet<String>();
	   System.out.println("Enter Name Of festival:");
       for(int i=0;i<n;i++)
	   {
		   String name = sc.next();
		   ln.add(name);
	   }
	   System.out.println(ln);
	   
	   System.out.println("Enter festival to Remove :");
	   String fes = sc.next();
	  
	     if(ln.contains(fes))
		 {
			 ln.remove(fes);
			 System.out.println("Festival remove successfully ");
		 }
		 else
		 {
			 System.out.println("No festival found ");
		 }
		 
		 System.out.println(ln);
		 
		 System.out.println("Enter Festival to search:");
		 String search = sc.next();
		 
		 if(ln.contains(search))
		 {
			 System.out.println("Festival Exist ");
		 }
		 else
		 {
			 System.out.println("Festival Not found");
		 }

         ArrayList<String> al = new ArrayList<>(ln);
         Collections.sort(al);
         System.out.println("Sorted Festival using Alphabetically " + al);		 
   }
 }

output:Enter Number of Festival :
4
Enter Name Of festival:
holi
diwali
id
dassera
[holi, diwali, id, dassera]
Enter festival to Remove :
diwali
Festival remove successfully
[holi, id, dassera]
Enter Festival to search:
id
Festival Exist
Sorted Festival using Alphabetically [dassera, holi, id]	   
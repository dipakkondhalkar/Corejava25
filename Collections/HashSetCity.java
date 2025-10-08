/*Q3. Problem:
Write a program using a HashSet to store city names (no duplicates allowed). Perform the following operations:
Add 8 cities (with at least 2 duplicates).
Display all cities.
Check if "Delhi" is present.
Remove a city.
Convert the HashSet to an ArrayList and display sorted cities.
Explanation:
Tests add(), contains(), remove().
Shows how HashSet removes duplicates automatically.
Conversion to ArrayList + sorting demonstrates hybrid use of collections.
*/

import java.util.*;
public class HashSetCity
{
 public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in);
	HashSet<String> hs = new HashSet<String>();
	System.out.println("Enter Number OF City :");
	int n = sc.nextInt();
	
	System.out.println("Enter City : ");
	for(int i=0;i<n;i++)
	{
		hs.add(sc.next());
	}
	
	System.out.println("Display ALL city : "+ hs);
	System.out.println("Enter Name OF city : ");
	String check = sc.next();
	
	if(hs.contains(check))
	{	
		System.out.println("City Present : "+ check);
	}
	else
	{
		System.out.println("City not Present.......");
	}
	System.out.println("Enter City : ");
	String removeCity = sc.next();
	
	if(hs.contains(removeCity))
	{
	hs.remove(removeCity);
	System.out.println("City remove SUCCESSFULLY");
    }
	else
	{
		System.out.println("City not exist ");
		
	}
     	
		System.out.println("Copy Hashset to arraylist :");
		ArrayList<String> al = new ArrayList<String>(hs);
		System.out.println(al);
 }
}
output:Enter Number OF City :
5
Enter City :
mumbai
pune
wau
mp
gujarat
Display ALL city : [mumbai, mp, pune, wau, gujarat]
Enter Name OF city :
mumbai
City Present : mumbai
Enter City :
mp
City remove SUCCESSFULLY
Copy Hashset to arraylist :
[mumbai, pune, wau, gujarat]
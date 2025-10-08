/*10. Question:
 	Return the first element that repeats in the array.
Input:
arr = {10, 5, 3, 4, 3, 5, 6}
Explanation:
Use a boolean array or nested loops to track seen elements.
Expected Output:
First repeating element is 5
*/

	
import java.util.*;
public class Problem10
{
	public static void main(String x[])
	{
      Scanner xyz  = new Scanner(System.in);
  
	  int a[]=new int[8];
	
	  
	  System.out.println("Enter  values of  array");
	  for(int i=0; i<a.length; i++)
	  {
	    a[i]=xyz.nextInt();
	  }
	  


System.out.println("THE FIRST REPEATING ELEMENT IS :");	  
		  for(int i=0; i<a.length; i++)
	  {    
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
			 System.out.println(a[i]);
			 return;
			 }
						   

		 }
		 			

	  }
	     System.out.println("No repeating element found.");
	    
	  

	  
}}
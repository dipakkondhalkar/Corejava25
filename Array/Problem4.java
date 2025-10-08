/*4.Problem:
Rearrange elements so even and odd elements alternate (same count assumed).
Input: [1, 2, 3, 4, 5, 6]
Output: [2, 1, 4, 3, 6, 5]

*/

	import java.util.*;
public class Problem4
{
	public static void main(String x[])
	{
      Scanner xyz  = new Scanner(System.in);
  
	  int a[]=new int[6];
	
	  
	  System.out.println("Enter  values of  array");
	  for(int i=0; i<a.length; i++)
	  {
	    a[i]=xyz.nextInt();
	  }
	  	  
	 
	
	  
//1 2 3 4 5 6 
	   for(int i=0; i<a.length; i++)
	  {
		 a[i]=a[i+1];
		 a[i+1]=a[i];
		 System.out.println(a[i]);
	  }
	    
	  

	  
}}

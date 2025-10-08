/*9.Problem: 
Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
	Output: true*/
	
import java.util.*;
public class Problem9
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
	  	  
	
	   for(int i=0; i<a.length; i++)
	  {
		 if(a[i]%5==0)
		 {
			 a[i]=5;
			 System.out.print(a[i]+" ");
			 
		 }
		 else{
			 			 System.out.print(a[i]+" ");

		 }
	  }
	    
	  

	  
}}

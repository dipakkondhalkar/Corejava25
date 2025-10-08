/*7.Problem:
Replace First and Last Element with 0.
Input: [5, 3, 7, 2]
Output: [0, 3, 7, 0]*/

import java.util.*;
public class Problem7
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
		  a[0]=0;
		  a[5]=0;
			 System.out.print(a[i]+" ");
			 
		 
		
	  }
	    
	  

	  
}}
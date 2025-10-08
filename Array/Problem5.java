
/*
5.Problem:
Replace all negative numbers in the array with 0.
Input: [2, -3, 4, -1, 5]
Output: [2, 0, 4, 0, 5]
*/
	import java.util.*;
public class Problem5
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
		 if(a[i]<0)
		 {
			 a[i]=0;
			 System.out.print(a[i]+" ");
			 
		 }
		 else{
			 			 System.out.print(a[i]+" ");

		 }
	  }
	    
	  

	  
}}
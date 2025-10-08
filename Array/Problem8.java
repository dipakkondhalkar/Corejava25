/*8.Problem: Write a Java program to replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [ 10, 12, 15, 17, 20 ]
Output: [5, 12, 5, 17, 20 ]*/

import java.util.*;
public class Problem8
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
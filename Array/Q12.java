 /*Q11. Write a program in java to find the ceiling in a sorted array?
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
 Expected Output :
Expected Output :
 The given array is : 1 3 5 7 8 9
 Number: 0 ceiling is: 1 floor is: -1
 Number: 1 ceiling is: 1 floor is: 1
 Number: 2 ceiling is: 3 floor is: 1
 Number: 3 ceiling is: 3 floor is: 3
 Number: 4 ceiling is: 5 floor is: 3
 Number: 5 ceiling is: 5 floor is: 5
 Number: 6 ceiling is: 7 floor is: 5
 Number: 7 ceiling is: 7 floor is: 7
 Number: 8 ceiling is: 8 floor is: 8
 Number: 9 ceiling is: 9 floor is: 9
 Number: 10 ceiling is: -1 floor is: 9
 */
 import java.util.*;
 public class Q12
 {
	 
	 static void celling(int a[])
	 {
	
		 for(int n=0;n<=10;n++)
		 {
			 
			  int flor=0;
			  int celling=0;
			for(int i=0;i<a.length;i++)
			 {
				 if(a[i]>=n)
				 {
				  celling =a[i];
				  break;
				 }
				 else
				 {
					 celling =-1;
					 
				 }
				 
			 }
			 
			for(int i=a.length-1;i>=0;i--)
				 {
					 if(a[i]<=n)
					 {
					  flor =a[i];
					  break;
					 }
					 else
					 {
						 flor =-1;
						
					 }
					 
			 }
            System.out.println("Number: " + n + " ceiling is: " + celling + " floor is: " + flor);

		 }
	 }
	 public static void main(String args[])
	 {   Scanner sc=new Scanner(System.in);
		 int a[]={1, 3 ,5 ,7 ,8 ,9};
		
		celling(a);
		
		 
		 
		 
	 }
	 
 }

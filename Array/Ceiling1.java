/* Q11. Write a program in java to find the ceiling in a sorted array?
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
 Expected Output :
 The given array is : 1 3 4 7 8 9 9 10
 The ceiling of 5 is: 7  */


import java.util.*;
public class Ceiling1
  {  public static void main(String[]args)
      {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array");
		int []a = new int[8];
		for(int i=0;i<a.length;i++)
		{
		  a[i] = sc.nextInt();	
		}
		System.out.println("Enter element of ceil");
		int x = sc.nextInt();
		int ceiling;
		for(int i=0;i<a.length;i++)
		{
		  if(a[i]>=x){
		  
		    ceiling = a[i];
			System.out.println("Ceiling is "+ceiling);
			break;
		  }
		 
		}
		// if(ceiling!=-1)
		// {
		
		 // System.out.println("Ceiling is "+ ceiling);
		// }
		// else{
		 
		   // System.out.println(x);
		// }
		
	  }  
  }
  /*
 output:
 Enter the elements in array
1 3 4 7 8 9 9 10
Enter element of ceil
5
Ceiling is 7   */
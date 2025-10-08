/*3. Count Even and Odd Numbers in an Array
o   Write a class to implement a method to count how many numbers are even and odd in an integer array.
 Explanation: Learn conditional checks and iteration in arrays. */
 
 
import java.util.*;

class Array 
{
   int x[] ;
   
   void getData(int a[])
   {
       x = a;
	   
   
   }
   
   void showData()
   {   int even = 0 ,odd = 0;
      for(int i=0 ;i<x.length;i++)
	  {
	     if(x[i] % 2 == 0)
		 {
		   even++;	 
		 }
		
		else
		 {
           odd++;    
		  }  
	  }
	  System.out.println("Count of even number is : " + even);
	  System.out.println("Count of odd number is : " + odd);
   }
}

public class EvenOddArray
{
    public static void main(String[]args)
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the elements in array");
	  
	  int a[] = new int[5];
	  for(int i=0 ;i<a.length;i++)
	  {
	      a[i]  = sc.nextInt();
	   
	  }
	
	   Array  s1 = new Array();
	   
	   s1.getData(a);
	    s1.showData();
	
	
	}
}

// Enter the elements in array
// 1
// 2
// 3
// 4
// 5
// Count of even number is 2
// Count of odd number is 3
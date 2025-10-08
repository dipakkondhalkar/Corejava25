/*Q14. Write a program in java to find the maximum circular subarray sum of a given array.
Expected Output :
 The given array is : 10 8 -20 5 -3 -5 10 -13 11
 The maximum circular sum in the above array is: 29  */
 
 import java.util.*;
 public class CircularSubarray
 {
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the elements in array");
	
	int []a = new int[9];
	
	for(int i=0;i<a.length;i++)
	{
	   a[i] = sc.nextInt();
    }
	
	 for(int i= 0; i<a.length;i++){
	      boolean flag = true;
		  int sum = 0;
	     for(int j=0 ;j<i+1;j++){
		 
		    if(a[i]<a[j])
			{
				  sum = a[i] + a[j];
			  flag = true ;
			  System.out.println("Circular subarray is");
			  System.out.println(" " + a[i]);
			
			}
		 }	
	 }
     
  }
 }
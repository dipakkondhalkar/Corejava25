/*Q20. Write a program in java to rearrange positive and negative numbers alternatively in a given array ?
Output:
If positive numbers are more they appear at the end and for also negative numbers, they too appear in the end of the array.
 Expected Output:
 The given array is:
 -4 8 -5 -6 5 -9 7 1 -21 -11 19
 The rearranged array is:
 -4 7 -5 1 -21 5 -11 8 -9 19 -6
*/

 import java.util.*;
 public class Q20
 {
	 public static void main(String args[])
	 {Scanner sc=new Scanner(System.in);
		int a[] ={1,-2,3,5,6,-4};
		Arrays.sort(a);
		
		int  left=0;
		int right=(a.length-1);

			System.out.println();
		
		System.out.println();
		int b[]=new int[a.length];
		for(int i=0;i<b.length-1;i+=2)
		{    
		  b[i]=a[left];
		  b[i+1]=a[right];
		  left++;
		  right--;
		}
		
		
		for(int i=0;i<b.length;i++)
		{    
		  System.out.println(b[i]+" ");
		}
		
	 }
 }
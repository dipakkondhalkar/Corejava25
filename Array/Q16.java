/*Q16. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
 */
 
 import java.util.*;
 public class Q16
 {
	 public static void main(String args[])
	 {Scanner sc=new Scanner(System.in);
		int a[] ={ 5, 2, 3 ,7 ,6, 4, 9,-7, 4, 5, 8};
		int first=a[0];
		int second =a[1];
		int diff=0;
		int i,j;
		int count =0;
		
		
		System.out.println("ENTER THE TARGET OR DIFFERENCE VALUE:");
		int target =sc.nextInt();
		
		boolean flag =true;
		for(i=0;i<a.length;i++)
		{    
			for(j=i+1;j<a.length;j++)
			{
				diff=(a[i]-a[j]);
				if(diff==target)
				{
					first =a[i];
					second=a[j];
					count++;
					System.out.print("("+first+","+second+")");
				}
				
			}

		}
					if(!flag)
		{
			System.out.print("THERE ARE NO PAIRS");
			
		}
		System.out.println("\n Number of distinct pairs for difference "+target+" are: "+ count);
		
		
	 }
 }
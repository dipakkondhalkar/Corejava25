/*Q15. Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5
 */
 
 
  import java.util.*;
 public class Q15
 {
	 public static void main(String args[])
	 {Scanner sc=new Scanner(System.in);
		int a[] ={9,5,10,6,7,2};
		int first=a[0];
		int second =a[1];
	
		int i,j;
		int count =0;
		System.out.println("THE INVERSIONS ARE:");
		for(i=0;i<a.length;i++)
		{    
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				
				{
					first =a[i];
					second=a[j];
					count++;
					System.out.print("("+first+","+second+")");
				}
				
				
			}

		}
				System.out.println("\nTHE INVERSIONS PAIRS ARE:"+count);

			
	 }
 }
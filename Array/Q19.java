/*19. Write a program in java to find a pair with the given difference
Expected Output:
 The given array is:
 1 15 39 75 92
 The given difference is: 53
 The pair are: (39, 92)
 */
 import java.util.*;
 public class Q19
 {
	 public static void main(String args[])
	 {Scanner sc=new Scanner(System.in);
		int a[] ={1,15,39,75,92,128};
		int first=a[0];
		int second =a[1];
		int diff=0;
		int i,j;
		System.out.println("ENTER THE TARGET OR DIFFERENCE VALUE:");
		int target =sc.nextInt();
		
		boolean flag =true;
		for(i=0;i<a.length;i++)
		{    
			for(j=i+1;j<a.length;j++)
			{
				diff=Math.abs(a[i]-a[j]);
						

				if(diff==target)
				{
					first=a[i];
					second=a[j];
					System.out.println(first +" -- "+second);
					
				}
				else
				{
					flag=false;
				}
				diff=0;
			}

		}
					if(!flag)
		{
			System.out.print("THERE ARE NO PAIRS");
			
		}
		
		
	 }
 }
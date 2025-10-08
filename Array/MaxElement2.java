
// Write a java Program to create 3*3 matrix and find max element from row .
/

import java.util.*;
public class MaxElement2
{  public static void main(String x[])
	{  int a[][]=new int[3][3];
	   Scanner xyz = new Scanner(System.in);
	   System.out.println("Enter values in matrix");
	   for(int i=0; i<a.length; i++)
	   {   for(int j=0; j<a[i].length; j++)
			{ a[i][j]=xyz.nextInt();
			}
	   }
	    
	   System.out.println("Display matrix");
	   for(int i=0,count=0; i<a.length; i++)
	   {    int max=a[i][count];
           for(int j=0; j<a[i].length; j++)
			{   
		       if(a[i][j]>max)
			   { max=a[i][j];
			   }
			}
			System.out.printf("Max value %d row is %d\n",(i+1),max);
			count=0;
	   }
	   
	}
}
output:
Enter values in matrix
8
9
3
12
8
4
11
14
3
Display matrix
Max value 1 row is 9
Max value 2 row is 12
Max value 3 row is 14     */



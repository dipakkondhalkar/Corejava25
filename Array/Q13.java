/*Q13. Write a program in java to find two elements whose sum is closest to zero
Expected Output :
 The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
 The Pair of elements whose sum is minimum are:
 [44, -46]
 
*/

public class Q13
{
	public static void main(String args[])
	{
		int a[]={1,4,-3,7};
		int sum=Math.abs(a[0]+a[1]); // Math.abs is use to get the value with out sign  like 9+(-11) = -2 but after abs its 2
		int first=a[0], second=a[1];//take this vairable to store and display 
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int x=Math.abs(a[i]+a[j]);
				if(x<sum)
				{
					sum=x;
					first=a[i];
					second=a[j];
				}
			}
		}
		System.out.println("THE TWO ELEMENTS WHOSE SUM IS CLOSEST TO ZERO IS \n"+first+" --- "+second);
	}
}
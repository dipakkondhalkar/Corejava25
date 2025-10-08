/*4. Problem:
 Create a class MaximumFinder with overloaded findMax methods to:
Return the maximum of two integers
Return the maximum of three integers
Return the maximum of two floats
Expected Overloads:
int findMax(int a, int b);
int findMax(int a, int b, int c);
float findMax(float a, float b); */

import java.util.*;
class MaximumFinder
{
    int findMax(int a,int b)
    {
	   return (a>b)? a:b;		
	}	
	int findMax(int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
	float findMax(float a, float b)
	{
		return (a>b)? a:b;
	}
}
public class Find
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		MaximumFinder  m1 = new MaximumFinder();
		
		System.out.println("Enter Two Elements :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter Third Elements :");
	    int c = sc.nextInt();
		System.out.println("Enter Number for float Max : ");
		float f1 = sc.nextFloat();
		float f2 = sc.nextFloat();
		
		System.out.println("======== Results =========");
		System.out.println("Max of Two ints : "+  m1.findMax(a,b));
    	System.out.println("Max of Three Ints : " + m1.findMax(a,b,c));
		System.out.println("Max of Two Float : "+  m1.findMax(f1,f2));
	}
	
}
/*
output:
Enter Two Elements :
12
14
Enter Third Elements :
25
Enter Number for float Max :
23.5
12.2
======== Results =========
Max of Two ints : 14
Max of Three Ints : 25
Max of Two Float : 23.5 */

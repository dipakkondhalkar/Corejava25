/*19. Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.*/

import java.util.*;

class demo
{

int no,no2;
int gcd,max;
	void  setNO(int n,int n2 )
	{
	no=n;
	no2=n2;

	}
	
	
	int findGCD()
	{
			if(no>no2)
			{
				max=no;
			}
			else
			{
				max=no2;
			}
			
			for(int i=2;i<max;i++)
			{
				if(no%i==0  && no2%i==0)
				{
					gcd=i;
					
				}
				
			}
	return gcd;
	}
	
	
}
class GCD
{
	public static void main(String args[])
	{
		demo s1 =new demo();
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER:");
	int no=sc.nextInt();
	System.out.println("ENTER THE NUMBER:");
	int no2=sc.nextInt();

	
		s1.setNO(no,no2);
		System.out.println("THE GREATEST COMMAN DIVISOR IS :"+s1.findGCD());
		
		
		}
}

ENTER THE NUMBER:
12
ENTER THE NUMBER:
1
THE GREATEST COMMAN DIVISOR IS :0
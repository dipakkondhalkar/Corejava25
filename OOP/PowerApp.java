/*13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/

import java.util.*;

public class PowerApp
{
   static int p =1;

    public static void main(String[]args)  
   {
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the two values");
	 int base = sc.nextInt();
	 int index = sc.nextInt();
	 power(base,index);
         
    }	
	public static void power(int b,int ind)
	{
	    if(ind!=0)
	 {
	     p = p * b;
		 power(b,--ind); 
	 }
	 else
	 {
	   System.out.println("Power is " + p);
	 
	  }
	 }
}
/*
output:
Enter the two values
5
3
Power is 125  */
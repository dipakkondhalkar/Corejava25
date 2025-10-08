/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

import java.util.*;
class cal
{
    int x;
	int y;
	
	void getData(int a,int b)
   {
       x = a ;
	   y = b;
		
   }
   
     void showData()
	 {
	    System.out.println("Addition is "+ (x+y));
		System.out.println("Substraction is " + (x-y));
		System.out.println("Mul is "+(x*y));
		System.out.println("Division is "+(x/y));
	 
	 }

}

class CalculatorInteger
{
 public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number");
	int a = sc.nextInt();
	
	System.out.println("Enter the second number");
	int b = sc.nextInt();
	
	cal s1 = new cal();
	s1.getData(a,b);
	s1.showData(); 
 }

}

// Enter the first number
// 12
// Enter the second number
// 10
// Addition is 22
// Substraction is 2
// Mul is 120
// Division is 1













/*12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
 */

import java.util.*;
class foactorial{
	
	int n;
	int fact = 1; 
	void setData(int no)
	{ 
	   n =no;  	
	}
	
    void Calculate()
    {  
       if(n>0)
	   {
	      fact  = fact * n;
	      n--;
		  Calculate();	  
	   }
	   else{
	     System.out.print("Factorial is "+fact);
	   }
	}
	  
     }
	 
   
   
   public class Factorial
{
   public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number ");
	 int no = sc.nextInt();
	 foactorial s1 = new foactorial();
	 
	 s1.setData(no);
	 s1.Calculate();
   }
}
// ouptut:
// Enter the number
// 4
// Factorial is 24
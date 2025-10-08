/*17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction. */


import java.util.*;
class DigitSum
{
   int no;
     void setData(int a)
	 {
		 
		 no = a;
	 }
	 void showData(){
	   int sum = 0;
	   int temp = no;
	  while(temp!=0)
	  {
	     int digit = temp%10;
		 sum = sum + digit;
		 temp = temp/10;
		 
	  }
	  
	  System.out.println("Sum of Given Digit is " + sum);
   }   
}

 public class DigitAdd
 {
    public static void main(String[]args)
	{
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the digit for sum");
	  int a = sc.nextInt();
	 
	  DigitSum s1 = new DigitSum();
	  s1.setData(a);
	  s1.showData();
	}
 
 }
 output:
 Enter the digit for sum
123
Sum of Given Digit is 6
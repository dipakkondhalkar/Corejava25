/*3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/

import java.util.*;

class Number
{
  int num1;
  int num2;
  
  void getData(int a,int b)
  {
     num1 = a;
	 num2 = b;
  
  }
  
  void show1()
  {
     if(num1== num2)
	 {
	   System.out.println("Number is Equal");
	 
	 }
     else
	 {
	    System.out.println("Number is not Equal");
	 }
  }
   
   void show2()
   {
     if(num1>num2 && num1!=num2)
	 {
	  System.out.println("Number first is greater");
	 
	 }
     else
	 {
	 System.out.println("Number second is greater");
	 
	 }
   }
}
   
   class NumberCheck
   {
     public static void main(String[]args)
	 {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first number");
	   int a = sc.nextInt();
	   
	   System.out.println("Enter the second number");
	   int b = sc.nextInt();
	   
	   Number s1 = new Number();
	   s1.getData(a,b);
	   s1.show1();
	   s1.show2();
	   
	  
	 }
   
   }
  /* output:
   Enter the first number
12
Enter the second number
11
Number is not Equal
Number first is greater  */
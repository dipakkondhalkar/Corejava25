/*4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic. */

import java.util.*;
class EvenOdd
{
  int no;
  
  void getData(int a)
  {
     no = a;
  
  }
  void getDisplay()
  {
     if(no%2 == 0)
	 {
	  System.out.println("Number is Even " );
	 }
	 else
	 {
	   System.out.println("Number is odd");
	 }
  
  }
}
class EvenOddNumber
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number");
	int a = sc.nextInt();
	
	EvenOdd s1 = new EvenOdd();
	
	s1.getData(a);
	s1.getDisplay();
   
  }
}
/*
output:
Enter Number
1
Number is odd  */











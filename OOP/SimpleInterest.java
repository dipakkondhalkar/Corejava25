//5. Calculate Simple Interest
//Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
//Explanation: Demonstrates mathematical formula implementation.

import java.util.*;
class Simple
{
   int principal;
   int rate;
   int time;
   
   void getData(int a, int b, int c)
   {
      principal = a;
	  rate = b;
	  time = c;
   
   }
   void showData()
   {
     int Amount  = principal * rate * time;
	 System.out.println("Simple interest is "+ Amount);
   }
}
class SimpleInterest
{
   public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Principal");
	 int a = sc.nextInt();
	 
	 System.out.println("Enter Rate");
	 int b = sc.nextInt();
	 
	 System.out.println("Enter time");
	 int c = sc.nextInt();
	 
	 Simple S1 = new Simple();
	 s1.getData(a,b,c);
	 s1.showData();
   }
  
}
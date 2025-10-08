/*14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.*/

import java.util.*;
class PrimeCheck
{
   int no;
    
     void setData(int a)
	 {
		 
		 no = a;
		 
	 }
	 void showData(){
	   int count = 0;
      for(int i = 1 ;i<=no ;i++)
	  {
	      if(no%i== 0)
		  {
		    count++;
		  }
		  
	  }
	    if(count==2)
		{
		
		 System.out.print("Number is prime");
		
		}
		else
		{
		   System.out.print("Number is not prime");
		 }
	  }   
}

 public class PrimeNum
 {
    public static void main(String[]args)
	{
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number ");
	  int a = sc.nextInt();
	  
	  PrimeCheck s1 = new PrimeCheck();
	  s1.setData(a);
	  s1.showData();
	}
 
 }
 
/*
output:
Enter the number
3
Number is prime   */







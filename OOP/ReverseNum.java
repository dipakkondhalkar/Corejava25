/*11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.  */

import java.util.*;

class Reverse
{	

    int no;
     void getData(int a )
	 {
	 
	 no = a;
	 
	 }
	void showData()
	{
	  int rev = 0,rem = 0;
	   while(no!=0)
	   {
	      rem = no%10;
		   no = no/10;
           rev = rev *10 + rem;	 
        
	   }

     System.out.println("Reversed Numbe " + rev);	
    
	}
}	

class ReverseNum
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int no = sc.nextInt();
	
	Reverse s1 = new Reverse();
	s1.getData(no);
	s1.showData();
	
	}
}
/*
output:
Enter Number
123
Reversed Numbe 321   */

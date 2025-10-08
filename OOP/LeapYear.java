/*18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.*/

import java.util.*;
class Leap
{
   int year;
     void setData(int a)
	 {
		 
		 year = a;
	 }
	 void showData(){
	  
	  if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
	  {
	  
	  System.out.println("Year is leap");
	  }
	  else
	  {
	    System.out.println("Not a year");
	  }
   }   
}

 public class LeapYear
 {
    public static void main(String[]args)
	{
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the year");
	  int a = sc.nextInt();
	 
	  Leap s1 = new Leap();
	  s1.setData(a);
	  s1.showData();
	}
 
 }
 /*
Enter the year
2010
Not a year  */

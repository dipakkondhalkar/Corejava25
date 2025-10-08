/*8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.*/

import java.util.*;

class Square
{
   int no;
   
   void getData(int a)
   {
      no = a;
   }
   void showData()
   {
     System.out.println("Square is "+ no*no);
   
   }
}

class SquareFinder
{
   public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter Number to Square");
	 int a = sc.nextInt();
	 Square s1 =new Square();
	 s1.getData(a);
	 s1.showData();
   
   }
  
}
// output:
// Enter Number to Square
// 10
// Square is 100
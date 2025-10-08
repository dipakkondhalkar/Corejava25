//10. Find the Area of a Circle
//Create a class CircleArea with a method findArea that calculates the area given the radius.

import java.util.*;
class Circle
{
  int radius;
  void getData(int a)
  {
     radius = a;
  
  }
  void showData()
  {
     double Area = 3.14 * radius * radius;
	 System.out.println("Area of Circle is "+ Area);
  
  }
}
class CircleArea
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter radius of circle");
	  int a =sc.nextInt();
	  
	  Circle s1 = new Circle();
	  s1.getData(a);
	  s1.showData();
   
   }
}
// output:
// Enter radius of circle
// 25
// Area of Circle is 1962.5
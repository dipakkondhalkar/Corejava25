/*Q.3
Create a class Rectangle with length and breadth.
Requirements:
Method setDimensions() to input dimensions.
Method calculateArea() to return area.
Display area using an object. */

import java.util.*;
class Rectangle 
{
   int length;
   int breadth;
   
   
   void setDimensions(int x,int y)
   {
     length = x;
	 breadth = y;
   }
   
   int calculateArea()
   {
	   int Area = length * breadth;
       System.out.println("Area of rectangle is  " + Area);
       return Area;
   }
   
}

class RectangleArea
{
  public static void main(String[]args)
  { 
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Length");
	 int x = sc.nextInt();
	 
	 System.out.println("Enter Breadth");
	 int y = sc.nextInt();
	 
	 Rectangle s1 = new Rectangle();
	 s1.setDimensions(x,y);
	 s1.calculateArea();
  }

}
/*
output:
Enter Length
10
Enter Breadth
10
Area of Rectangle = 100  */
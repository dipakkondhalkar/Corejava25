/*Q5. Question:
 Create a Java class Shape using constructor overloading:
First constructor takes length and breadth (for rectangle).
Second constructor takes side (for square).
Perform the following:
Calculate the area inside the constructor.
If area > 100, print "Large Shape", otherwise "Small Shape".
Explanation:
 This question tests the use of constructor overloading to represent different shapes,
 performing area calculation, and applying conditional checks.
*/

import java.util.*;
class Shape
{
   int length;
   int breadth;
   int side;
   int Area;
   Shape(int length, int breadth)
   {
      this.length = length;
	  this.breadth = breadth;
	  Area  = length * breadth;
	   checkSize();
	  
   }
   
   Shape(int side)
   {
      this.side = side;
	  Area = side * side;
	  checkSize();
	  
   } 
void checkSize()
   {
	    
	  if(Area > 100)
	  {
	     System.out.println("Large Shape");
	  
	  }
	  else
	  {
	     System.out.println("Small Shape");
	  }
	   
   }
   void display()
   {   if(side != 0)
	   {
      System.out.println("Side :" + side);
	  
	   }
	   else {
	  System.out.println("Breadth : " + breadth);
	  System.out.println("Side :" + side);
	  
	   }
	  System.out.println("Area : " + Area);
   
   }
  
}

public class ShapeCheck
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 //Rectangle.
	 System.out.println("Enter the Size of Shape");
	 System.out.println("Enter Length");
	 int L = sc.nextInt();
	 
	 System.out.println("Enter Breadth");
	 int B = sc.nextInt();
	 
	 Shape rect = new Shape(L,B);
	 
	 rect.display();
	 rect.checkSize();
	 
	 System.out.println("Enter Side");
	 int s = sc.nextInt();
	 Shape sq = new Shape(s);
	 sq.display();
	 sq.checkSize();
  }
}
/*
output:
Enter the Size of Shape
Enter Length
20
Enter Breadth
20
Large Shape
Breadth : 20
Side :0
Area : 400
Large Shape
Enter Side
20
Large Shape
Side :20
Area : 400
Large Shape  */
















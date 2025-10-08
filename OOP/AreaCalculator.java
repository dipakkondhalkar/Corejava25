/*Q1. Problem:
 Write a class AreaCalculator with overloaded methods calculateArea to compute:
Area of a square
Area of a rectangle
Area of a circle   */

class AreaCalculator
{
	 double calculateArea(double side)
	 {
		 
		 return side* side;
	 }
	 double calculateArea(double length,double breadth)
	 {
		 
		 return length * breadth;
	 }
	 double calculateArea(float redius)
	 {
		 return 3.14 * redius * redius;
	 }
	
	public static void main(String[]args)
	{
	     AreaCalculator s1 = new AreaCalculator();
		
		System.out.println("Area of Square : " + s1.calculateArea(10));
		System.out.println("Area of Rectangle : " + s1.calculateArea(10,20));
		System.out.println("Area of Circle : "+  s1.calculateArea(3));
	}
}
/*
output:
Area of Square : 314.0
Area of Rectangle : 200.0
Area of Circle : 28.259999999999998 */
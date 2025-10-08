/*Q.1
Simple Calculator Using Inheritance
Create a base class Operation with two numbers. Create subclasses for:
Addition
Subtraction
Multiplication
Division
Each subclass overrides a method calculate() and performs respective operations.*/

import java.util.*;
class Calculate
{
  int x,y;
  
  void setValue(int x, int y)
  {
     this.x = x;
	 this.y = y;
  }
}
class Add extends Calculate
{
   int getAdd()
   {
      return x+y;
   }
}
class Sub extends Calculate
{
   int getSub()
   {
      return x-y;
   }
}
class Mul extends Calculate
{
  int getMul()
  {
     return x*y;
  }
}
class Div extends Calculate
{
   int getdiv()
   {
      return x/y;
   }
}
public class Calculator

{
  public static void main(String []args)
  {
	 Scanner sc = new Scanner(System.in);
	 
     Add s1 = new Add();
	 System.out.println("Enter Two Number : ");
	 int x = sc.nextInt();
	 int y = sc.nextInt();
	  s1.setValue(x,y);
	  
	  int result = s1.getAdd();
	  System.out.println("Addition is : " + result);
	  
	  Sub s2 = new Sub();
	  s2.setValue(10,10);
	  result = s2.getSub();
	  System.out.println("Subtraction is :" + result);
	  
	  Mul s3 = new Mul();
	  s3.setValue(10,10);
	  result = s3.getMul();
	  System.out.println("Multiplication is : " + result);
	  
	  Div s4 = new Div();
	  s4.setValue(100,10);
	  result  = s4.getdiv();
	  System.out.println("Division  is : " + result);
  }
  
}
/*
output:
Addition is : 30
Subtraction is :0
Multiplication is : 100
Division  is : 10
*/

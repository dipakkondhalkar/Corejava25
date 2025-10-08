/*3. Problem:
 Create a class Rectangle with fields: length, breadth.
 Set values using setters.
 In main method, calculate and display area and perimeter.
Formula:
Area = length × breadth
Perimeter = 2 × (length + breadth)
Explanation:
 Basic formula application using class object.  */
 
 
import java.util.*;
class Area
{
	int length;
	int breadth;
	
	
	public void setlength(int length)
	{
		this.length=length;
	}
	public void setbreadth(int breadth)
	{
		this.breadth=breadth;
	}
	public int getlength()
	{
		return length;
	}
	public int getbreadth()
	{
		return breadth;
	}
}

public class AreaApplication{ 
public static void main(String args[])
 {
	  Scanner sc = new Scanner(System.in);
	   int length, breadth;
	   
     Area a =  new Area();
	 
	a.setlength(20);
    a.setbreadth(20);
	length=a.getlength();
	breadth=a.getbreadth();
	System.out.print("Area of rectangle is : "  + length*breadth);
	System.out.print("\n Perimter of rectangle is : " +  2 * (length * breadth));
	 
 }
}

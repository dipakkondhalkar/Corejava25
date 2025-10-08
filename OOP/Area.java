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
	
	public int getlength()
	{
		return length;
	}
	public int getbreadth()
	{
		return breadth;
	}
	public void setlength(int length)
	{
		this.length=length;
	}
	public void setbreadth(int breadth)
	{
		this.breadth=breadth;
	}

int avg;
 void result()
 {
	  avg =(m1+m2+m3)/3;
	 System.out.println("TOTAL AVG OR MARKS :"+avg);
	 if(avg>=75)
	 {
		 System.out.println("A Grade");
	 }
	 else if(avg>=60)
	 {
		 
		   System.out.println("B Grade");
		  
	 }
	 else
	 {
		    System.out.println("c Grade");
	 }
	 
 }
 
 public static void main(String args[])
 {
	  Scanner sc = new Scanner(System.in);
	  
	  Stud[] obj = new Stud[3];
for(int i=0;i<3;i++)
{
	obj[i]=new Stud();
	
	 System.out.println("--------Enter the student Details-------");
	
	  System.out.println("\nEnter Name of Student");
      obj[i].setName(sc.next());
	  
	  System.out.println("Enter the roll number");
	  obj[i].setRollno(sc.nextInt());
	  
	  System.out.println(" Enter Marks 1st ");
	  obj[i].setM1(sc.nextInt());
	  
	  System.out.println("Enter marks 2nd ");
	  obj[i].setM2(sc.nextInt());
	  
	  System.out.println("Enter marks 3rd");
	  obj[i].setM3(sc.nextInt());
	 
	 obj[i].result();
}

 }
}

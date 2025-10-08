/*Create a class Student with fields: rollNo, name, marks1, marks2, marks3.
Write methods to calculate total marks and average, and display the grade:
If avg ≥ 75: Grade A
If avg ≥ 60: Grade B
Else: Grade C
Objective: Implement condition checks and use method-based logic.
*/


import java.util.*;
class Stud
{
	String name;
	int m1;
	int m2;
	int m3;
	int rollNo;
	
	public String getName()
	{
		return name;
	}
	public int getM1()
	{
		return m1;
	}
	public int getM2()
	{
		return m2;
	}
	public int getM3()
	{
		return m3;
	}
	public int getRollno()
	{
		return rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setM1(int m1)
	{
		this.m1=m1;
	}
	public void setM2(int m2)
	{
		this.m2=m2;
	}
	public void setM3(int m3)
	{
		this.m3=m3;
	}
	public void setRollno(int rollNo)
	{
		this.rollNo=rollNo;
	}

int avg;
 void result()
 {
	 avg =(m1+m2+m3)/3;
	 System.out.println("TOTAL AVG OF MARKS :"+avg);
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
	
	 System.out.println("-------- Enter the student Details -------");
	
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
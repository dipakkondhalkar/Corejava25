/*Q.5
Single Inheritance – Student and Marks
Create a Student class with attributes: rollNo, name.
Derive a Marks class that adds subject1, subject2, subject3.
Write methods to calculate total and percentage.
Display details of the student.*/

import java.util.*;

class Student
{
   int rollNo;
   String name;
   
   Student(int rollNo, String name)
   {
      this.rollNo = rollNo;
	  this.name = name;
   }
   
   void calculate()
   {
     System.out.println("Roll : " + rollNo + "Name : " + name );
   }
}

class Marks extends Student
{
    int subject1,subject2,subject3;
	
	Marks(int rollNo, String name ,int subject1, int subject2, int subject3)
	{ super(rollNo,name);          //call Parent contructor.
	   this.subject1 = subject1;
	   this.subject2 = subject2;
	   this.subject3 = subject3;
	}
	
	int calculateTotal()
	{
	   return subject1 + subject2 + subject3;
	}
	double percentage()
	{
	  return calculateTotal()/3.0;
	}
	
	void display()
	{  System.out.println("-------------------------------");
	   System.out.println("Subject 1 Marks : " + subject1);
	   System.out.println("Subject 2 Marks : " + subject2);
	   System.out.println("Subject 3 Marks : " + subject3);
	   System.out.println("Total  : " + calculateTotal());
	   System.out.println("Percentage : "  + percentage());
	   System.out.println("-------------------------------");
	}

}

public class StudentData1
{  
   public static void main(String []args)
   {
     Scanner sc = new Scanner(System.in);     
	 System.out.println("--------Stduent Details----------");
	 System.out.println("Enter Roll No ");
	 int rollNo = sc.nextInt();
	 
	 System.out.println("Enter Name : ");
	 String name = sc.next();
	 
	 System.out.println("Marks 1 Subject :");
     int subject1 = sc.nextInt();
	 
	 System.out.println("Marks 2 Subject :");
     int subject2 = sc.nextInt();
	 
	 System.out.println("Marks 3 Subject :");
     int subject3 = sc.nextInt();
	 
	 Marks m1 = new Marks(rollNo, name , subject1, subject2, subject3);
	 m1.display();

	   
   }
}
/*
output:
--------Stduent Details----------
Enter Roll No
121323
Enter Name :
dipak
Marks 1 Subject :
80
Marks 2 Subject :
90
Marks 3 Subject :
70
-------------------------------
Subject 1 Marks : 80
Subject 2 Marks : 90
Subject 3 Marks : 70
Total  : 240
Percentage : 80.0
------------------------------- */
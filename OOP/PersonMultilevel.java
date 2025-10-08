/*Q.7
Person → Student → GraduateStudent (Multilevel Inheritance)
Person has: name, age.
Student extends Person and adds rollNo, course.
GraduateStudent extends Student and adds thesisTitle.
Print full details of GraduateStudent.*/

import java.util.*;

class Person
{
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
     void display()
	{ 
	   
		System.out.println("Name : "+ name);	
		System.out.println("Age : " + age);	
	}
}
class Student extends Person
{
	int rollNo;
	String course;
	Student(String name, int age ,int rollNo,String course)
	{    super(name,age);
	    this.rollNo = rollNo;
		this.course = course;
	}
	void displayStudent()
	{   
	    display();
		System.out.println("RollNo : "+ rollNo);
		System.out.println("Course : " + course);
	}
	
}
class GraduateStudent extends Student
{
	String thesisTitle;
	GraduateStudent(String name, int age,int rollNo , String course ,String thesisTitle)
	{    super(name,age,rollNo,course);
		this.thesisTitle = thesisTitle;
	}
	
	void displaygraduateStudent()
	{
		displayStudent();
		System.out.println("Title : " + thesisTitle);
		
	}
}	
public class PersonMultilevel
{
	 public static void main(String[]args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("----------Student Detail----------");
		 
		 System.out.println("Enter Name :");
		 String name =sc.next();
		 
		 System.out.println("Enter Age : ");
		 int age  = sc.nextInt();
		 
		 System.out.println("Enter Roll No : ");
		 int rollNo = sc.nextInt();
		 
		 System.out.println("Course : ");
		 String course = sc.next();
		 
		 System.out.println("Title : ");
		 String thesisTitle = sc.next();
		 
		 GraduateStudent s1 = new GraduateStudent(name,age,rollNo,course,thesisTitle);
		  
		  System.out.println("-----GraduateStudent Details----------");
	      s1.displaygraduateStudent();	  
	 }
}

output:
----------Student Detail----------
Enter Name :
DIPAK
Enter Age :
23
Enter Roll No :
2322323
Course :
comp
Title :
Ai
-----GraduateStudent Details----------
Name : DIPAK
Age : 23
RollNo : 2322323
Course : comp
Title : Ai
 
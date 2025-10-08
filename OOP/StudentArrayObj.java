/*1. Problem:
Create a Java program to store information of 5 students (rollNo, name, marks in 3 subjects). Perform the following:
Accept details for each student.
Calculate total and average marks for each student.
Display all details including total and average.
Explanation:
This question helps practice creating a Student class,
 storing student data in an array of objects, and using logic to compute total and average marks
 for each student without using constructors */
 
 import java.util.*;

class Student
{
  private int rollNo;
  private String name;
  private int m1 , m2, m3;
  private int total;
  private double average;
  
  //Setter method.
  
  public void setRollNo(int rollNo)
  {
     this.rollNo = rollNo;
  }
  public int getRollNo()
  {
      return rollNo;
  }
  public void setname(String name)
  {
     this.name = name;
	 
  }
  public String getname()
  {
    return name;
  }
  public void setm1(int m1)
  {
  
     this.m1 = m1;
  }
  public int getm1()
  {
    return  m1;
  }public void setm2(int m2)
  {
  
     this.m2 = m2;
  }
  public int getm2()
  {
    return m2;
  }
  public void setm3(int m3)
  {
  
     this.m3 = m3;
  }
  public int getm3()
  {
    return m3;
	
  }
  public void settotal(int total)
  {
  
     this.total = total;
  }
  public int gettotal()
  {
    return total;
  }
  public void setaverage(double average)
  {
  
     this.average = average;
  }
  public double getaverage()
  {
    return average;
  }
  
  
  
  public void calculateAverage()
  {  
     total = m1 + m2 + m3;
	 average = total/3.0;
   
  }
 } 
  
  public class StudentArrayObj
  {
     public static void main(String []args)
	 {
	    Scanner sc = new Scanner(System.in);
		
		Student []stud = new Student[3];
		
		//input details of students
		
		for(int i=0;i<stud.length;i++)
		{
			stud[i] = new Student();
			
			System.out.println("\nEnter Name :");
		
			String name = sc.nextLine();
			System.out.println("Enter Rollno");
			int rollNo = sc.nextInt();
			 System.out.println("Enter marks 1 Sub:");
			int m1 = sc.nextInt();
			System.out.println("Enter Marks 2 sub:");
			int m2 = sc.nextInt();
			System.out.println("Enter Marks 3 Sub:");
			int m3 = sc.nextInt();
			System.out.println("-----------------------");
			sc.nextLine();
			
			stud[i].setname(name);
			stud[i].setRollNo(rollNo);
			stud[i].setm1(m1);
			stud[i].setm2(m2);
			stud[i].setm3(m3);
			
			
			stud[i].calculateAverage();
			
		}
		
		System.out.println("\nName\tRollNo\tSub1\tSub2\tSub3\ttotal\tAverage");
		
		for(int i=0;i<stud.length;i++)
		{
            System.out.println(stud[i].getname() + "\t" + stud[i].getRollNo() + "\t" +
                       stud[i].getm1() + "\t" + stud[i].getm2() + "\t" +
                       stud[i].getm3() + "\t" + stud[i].gettotal() + "\t" +
                       stud[i].getaverage()); 	  
		  
		}	
		
	 }
   
  }
  /*
  output:
  Enter Name :
dhanu
Enter Rollno
25
Enter marks 1 Sub:
70
Enter Marks 2 sub:
80
Enter Marks 3 Sub:
90
-----------------------

Enter Name :
ramesh
Enter Rollno
28
Enter marks 1 Sub:
40
Enter Marks 2 sub:
30
Enter Marks 3 Sub:
55
-----------------------

Enter Name :
ganesh
Enter Rollno
30
Enter marks 1 Sub:
80
Enter Marks 2 sub:
65
Enter Marks 3 Sub:
85
-----------------------

Name    RollNo  Sub1    Sub2    Sub3    total   Average
dhanu   25      70      80      90      240     80.0
ramesh  28      40      30      55      125     41.666666666666664
ganesh  30      80      65      85      230     76.66666666666667  */
  
  
  

/*
Q.1
Objective: Create a class Student with fields: rollNo, name, marks.
Requirements:
Create a method setData() to assign values.
Create a method displayData() to print values.
Create 2 objects and display their data.
  */
  
import java.util.*;
class Student
{  
  
  int RollNo;//step 1.
  String name;
  int marks;
  
  void getData(int a,String b ,int c){
  RollNo=a;
  name=b;
  marks=c;
  
 
 }
  void showData(){
 
 System.out.println(RollNo + "\n" + name +"\n" +marks);
 
 }
}
 class  StudentData
 {
   public static void main(String[]args)
   {
	  Scanner sc = new Scanner(System.in);
	  			

	  System.out.println("Enter the RollNo");
	  int a = sc.nextInt();
	  
	  System.out.println("Enter the Name");
	  String b = sc.next();
	  
	  System.out.println("Enter Marks");
	  int c = sc.nextInt();
	  Student s1 = new Student();
	  
	  
		
	  s1.getData(a,b,c);
	  s1.showData();
	  Student s2 = new Student();	
	  System.out.println("Enter the RollNo");
	   a = sc.nextInt();
	  
	  System.out.println("Enter the Name");
	   b = sc.next();
	  
	  System.out.println("Enter Marks");
	   c = sc.nextInt();
	  
	  
	  s2.getData(a,b,c);
	  s2.showData();
	
     
   }
 }
 /*
 output:
 Enter the RollNo
1
Enter the Name
Deep
Enter Marks
55
1
Deep
55
Enter the RollNo
2
Enter the Name
Manis
Enter Marks
50
2
Manis
50   */
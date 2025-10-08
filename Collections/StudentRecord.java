/*Q1. ArrayList - Student Records
Write a program using ArrayList and POJO class Student (id, name, marks).
Add at least 5 students.
Display all records.
Update marks of a given student.
Remove student by id.
Find student with highest marks.
*/

import java.util.*;
class Student
{
  private int id;
  private String name;
  private int marks;
  
  public Student(int id, String name ,int marks)
  {
     this.id = id;
	 this.name = name;
	 this.marks = marks;
  }
  public int getid()
  {
     return id;
  }
  public String getname()
  {
     return name;
  }
  public void setmarks(int marks)
  {
	  
	  this.marks = marks;
  }
  public int getmarks()
  {
    return marks;
  }
  public String toString()
  {
     return "id  :  " + id + " name : "+ name + " marks : "+ marks;
  }
}

public class StudentRecord
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	
	ArrayList<Student> al = new ArrayList<>();

    do{
   
       System.out.println("--Student Details--");
	   System.out.println("1. Add Student  \n  2.Display Student  \n 3.Update marks  \n  4. Remove Student By Id  \n  5.  Find Highest Student Marks  \n  6. Exiting. ");
	   System.out.println("Enter CHOICE ---");
	   int choice  = sc.nextInt();
	   
       switch(choice)
	   {
		   case 1 :
		   
		   System.out.println("Enter 5 Student Data :");
	        int n = 5;
            for(int i=0;i<n;i++)
			{
				System.out.println("ID : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Name : ");
				String name = sc.next();
			    System.out.println("Marks : ");
				int marks = sc.nextInt();
				al.add(new Student(id , name , marks));
				
			}	
             System.out.println("Student ADDED Successfully....");
			 
			 break;
			 
			 
			 case 2 :
			 
			 System.out.println("Display Data :" );
			 for(Student s : al)
			 { 
				 System.out.println(s);
			 }
			 break;
			 
			 
			 case 3 :
			 
			 System.out.println("Enter id : ");
			 int uid = sc.nextInt();
			 boolean found = false;
			 for(Student s : al)
			 {
			    if(s.getid()== uid)
				{
					System.out.println("Enter Marks : ");
					int newmarks = sc.nextInt();
					
					s.setmarks(newmarks);
					
					System.out.println("Marks update Successfully..");
					found = true;
					break;
				}
				if(!found)
				{
					System.out.println("Data Not found...");
					break;
				}	
			 }
			    break; 
				
				
		case 4:
				
		   if (!al.isEmpty()) {
           Student top = al.get(0);
           for (Student s : al)
		 {
           if(s.getmarks() > top.getmarks()) {
           top = s;
           
		   }
           }
           System.out.println("Student with highest marks: " + top);
           }
		   else {
           System.out.println("No students available.");
          }
		  
		  break;
		  
		  case 5:
		  
		  System.out.println("Exiting ");
		  break;
		  
		  
		  default :
		  
		  System.out.println("Invalid Input...");
		  System.exit(0);
		  
				
	   }
    }
      while(true);	
  }
}
output:
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
1
Enter 5 Student Data :
ID :
12
Name :
dipak
Marks :
78
ID :
13
Name :
deep
Marks :
98
ID :
14
Name :
vijay
Marks :
78
ID :
15
Name :
dinesh
Marks :
57
ID :
16
Name :
digant
Marks :
88
Student ADDED Successfully....
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
2
Display Data :
id  :  12 name : dipak marks : 78
id  :  13 name : deep marks : 98
id  :  14 name : vijay marks : 78
id  :  15 name : dinesh marks : 57
id  :  16 name : digant marks : 88
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
3
Enter id :
12
Enter Marks :
40
Marks update Successfully..
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
2
Display Data :
id  :  12 name : dipak marks : 40
id  :  13 name : deep marks : 98
id  :  14 name : vijay marks : 78
id  :  15 name : dinesh marks : 57
id  :  16 name : digant marks : 88
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
5
Exiting
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
3
Enter id :
1
Data Not found...
Data Not found...
Data Not found...
Data Not found...
Data Not found...
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
4
Student with highest marks: id  :  13 name : deep marks : 98
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
5
Exiting
--Student Details--
1. Add Student
  2.Display Student
 3.Update marks
  4. Remove Student By Id
  5.  Find Highest Student Marks
  6. Exiting.
Enter CHOICE ---
6
Invalid Input... 











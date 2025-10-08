/*Q1. Student Management System using ArrayList
Problem:Create a Student POJO class with attributes: id, name, and marks.
Store multiple students inside an ArrayList<Student>.
Write a method using generics that prints all student details.
Perform operations:
Add students
Remove a student by id
Search student by name
Explanation:
Here you’ll learn how to use ArrayList<Student> 
(with POJO) and Generics (List<Student>) to perform CRUD operations.
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
  public int getmarks()
  {
    return marks;
  }
  public String toString()
  {
     return "id  :  " + id + " name : "+ name + " marks : "+ marks;
  }
}
public class StudentMSystem
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 ArrayList<Student> al = new ArrayList<>();
	
     do{
		System.out.println("\n\n------Student Details----------");
        System.out.println("1. Add Student \n  2.Remove Students By ID  \n  3. Search by Name \n 4. Display Data 5. Exiting Loop  \n" );
        System.out.println("Enter Choice :");
        int choice = sc.nextInt();

       switch(choice)
	   {
		   case 1 :
		   System.out.println("Add Student DETAILS ");
		   System.out.println("Enter Id :");
		   int id = sc.nextInt();
		   
		   System.out.println("Enter Name :");
		   String name = sc.next();
		   
		   System.out.println("Enter Marks : ");
		   int marks = sc.nextInt();
		   sc.nextLine();
		   
		   al.add(new Student(id,name,marks));
		   break;
		   
		   
		   case 2 :
		   
		   System.out.println("Enter Student Id TO Remove : ");
		   int r = sc.nextInt();
		   
		   if(al.contains(r))
		   {
			   al.remove(r);
		   }
		   else
		   {
			   System.out.println("Invalid Id ");
		   }
		   break;
		   
		   
		   case 3:
		   
		   System.out.println("Enter Name to Search :");
		   String search = sc.next();
		   for(Student s : al)
		   {
			   if(s.getname().equalsIgnoreCase(search))
			   {
				   System.out.println("Name is : " + s);
				   
			   }
			   
			   
		   }
		  
		   break;
		   
		   
		   case 4:
		   
		   System.out.println("ALL Student Data :");
		   System.out.println(al);
		   
		   break;
		   
		   default :
		   
		   System.out.println("Invalid Input..");
		   System.exit(0);
	   }	   
		 
	 }
	 while(true);
  }
  
}
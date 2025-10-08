/*Q1. Store and Sort Student Marks
Create a Student class with fields: name and marks.
Store multiple students in an ArrayList.
Sort them by marks using Comparable.
Print the sorted list.
 Explanation:
 This tests your ability to:
Implement Comparable<Student> for sorting.
Use Collections.sort(list) on an ArrayList of objects.*/

import java.util.*;
class Student implements Comparable
{
   private String name;
   private int marks;
   
   public Student()
   {
   }
   public Student(String name,int marks)
   {
     this.name = name;
	 this.marks = marks;
   }
   public void setname(String name)
   {
      this.name = name;
	  
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
   public int compareTo(Object o)
   {
	   Student s = (Student)o;
	   if(this.marks > s.marks)
	   {
		   return 1;
	   }
	   else if(this.marks < s.marks)
	   {
		  return -1;
	   }
	   else
	   {
		   return 0;
	   }
   }
}
public class StudentData
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	List list = new ArrayList();
	
	  list.add(new Student("Deep ",91));
	  list.add(new Student("Vijay",89));
	  list.add(new Student("ram",94));
	  list.add(new Student("ramesh",99));
	  list.add(new Student("pranav",71));
	  
	 System.out.println("Display Employee Data Before Sorting : ");
	 for(Object obj:list) {
			Student s=(Student)obj;
			System.out.println("\t"+s.getname()+"\t"+s.getmarks());
		}
		Collections.sort(list);
		System.out.println("Display employee data After sorting");
		for(Object obj:list) {
			Student s=(Student)obj;
			System.out.println("\t"+s.getname()+"\t"+s.getmarks());
		}
	}
}
output:
Display Employee Data Before Sorting :
        Deep    91
        Vijay   89
        ram     94
        ramesh  99
        pranav  71
Display employee data After sorting
        pranav  71
        Vijay   89
        Deep    91
        ram     94
        ramesh  99 
/*Q1. Store and Sort Student Marks
Create a Student class with fields: name and marks.
Store multiple students in an ArrayList.
Sort them by marks using Comparable.
Print the sorted list.
*/

import java.util.*;

class Student{
	private String name;
	private int marks;
	
	Student(){
		
	}
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setMarks(int marks){
		this.marks = marks;
	}
	public int getMarks(){
		return marks;
	}	
}

class Marks  implements Comparator{
	
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		if(s1.getMarks() > s2.getMarks()){
			return 1;
		}else if(s1.getMarks() < s2.getMarks()){
			return -1;
		}else{
			return 0;
		}
	}
}

public class StudentMarksQ1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student size");
		int n = sc.nextInt();
		
		ArrayList al = new ArrayList();
		System.out.println("Enter Student Details");
		
		for(int i=0; i<n; i++){
			
			sc.nextLine();
			System.out.println("\nEnter Name");
			String name = sc.nextLine();
			
			System.out.println("Enter Marks");
			int marks = sc.nextInt();
			
			al.add(new Student(name, marks)); 
		}
		
		Comparator c = new Marks();
		Collections.sort(al,c);
		
		System.out.println("\nStudent Details");
		
		 for (Object obj : al) {
            Student s = (Student) obj; 
            System.out.println(s.getName() + "\t" + s.getMarks());
        }
	}
}
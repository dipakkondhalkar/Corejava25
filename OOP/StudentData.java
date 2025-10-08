/*Q2. Question:
 Create a Java class Student with constructor overloading:
First constructor takes rollNo, name, and 3 subject marks.
Second constructor takes rollNo, name, and 5 subject marks.
Perform the following:
Calculate the total marks and percentage.
Assign grades: A if percentage ≥ 75, B if ≥ 60, otherwise C.
Explanation:
 This question tests constructor overloading with different number of parameters, and the ability to perform arithmetic operations and decision-making inside constructors.
*/

import java.util.*;

class Student {
    int rollNo;
    String name;
    int s1, s2, s3, s4, s5;
    int totalMarks;
    double percentage;
    String grade;

    // Constructor for 3 subjects
    Student(int rollNo, String name, int s1, int s2, int s3) {
        this.rollNo = rollNo;
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = 0;
        this.s5 = 0;
        this.totalMarks = s1 + s2 + s3;
        this.percentage = (totalMarks / 3.0);
        assignGrade();
    }

    // Constructor for 5 subjects
    Student(int rollNo, String name, int s1, int s2, int s3, int s4, int s5) {
        this.rollNo = rollNo;
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.totalMarks = s1 + s2 + s3 + s4 + s5;
        this.percentage = (totalMarks / 5.0);
        assignGrade();
    }

    void assignGrade() {
        if (percentage >= 75)
            grade = "A Grade";
        else if (percentage >= 60)
            grade = "B Grade";
        else
            grade = "C Grade";
    }

    void display() {
        System.out.println("Student Id : " + rollNo);
        System.out.println("Student Name : " + name);
        System.out.println("Subject 1 : " + s1);
        System.out.println("Subject 2 : " + s2);
        System.out.println("Subject 3 : " + s3);
        System.out.println("Subject 4 : " + s4);
        System.out.println("Subject 5 : " + s5);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade : " + grade);
    }
}

public class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student 1 Details------>");
        System.out.print("Enter the Id: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter 3 Subject Marks: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        Student student1 = new Student(id1, name1, s1, s2, s3);
        student1.display();

        System.out.println("\nEnter Student 2 Details------>");
        System.out.print("Enter the Id: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter 5 Subject Marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        Student student2 = new Student(id2, name2, m1, m2, m3, m4, m5);
        student2.display();
    }
}






















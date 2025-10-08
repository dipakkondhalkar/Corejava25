/*🔸 Question 3: Student Performance Report – Calculate Grade Differently for Each Stream
Description:
Create a base class Student with fields name, marks and a method calculateGrade(). 
Then create 3 classes: ScienceStudent, CommerceStudent, and ArtsStudent. 
Each should override calculateGrade() with its own logic.
Task:
Write a method printGrades(Student[] students) that prints the 
name and grade of each student, using the overridden method.
Objective:
Practice polymorphism through method overriding
 and processing a list of parent-class objects that use child-class logic.*/


import java.util.Scanner;
class Student {
    String fname;
    double marks;

    Student(String fname, double marks) {
        this.fname = fname;
        this.marks = marks;
    }

    String calculateGrade() {
        return "Default Grade";  
    }
}

// Child classes
class ScienceStudent extends Student {
    ScienceStudent(String fname, double marks) {
        super(fname, marks);
    }

    @Override
    String calculateGrade() {
        if (marks >= 90) return "A Grade";
        else if (marks >= 85) return "B Grade";
        else if (marks >= 75) return "C Grade";
        else return "Fail";
    }
}

class CommerceStudent extends Student {
    CommerceStudent(String fname, double marks) {
        super(fname, marks);
    }


    String calculateGrade() {
        if (marks >= 80) return "A Grade";   // different logic can be added
        else if (marks >= 70) return "B Grade";
        else if (marks >= 60) return "C Grade";
        else return "Fail";
    }
}

class ArtsStudent extends Student {
    ArtsStudent(String fname, double marks) {
        super(fname, marks);
    }

    @Override
    String calculateGrade() {
        if (marks >= 75) return "A Grade";   // different logic again
        else if (marks >= 65) return "B Grade";
        else if (marks >= 55) return "C Grade";
        else return "Fail";
    }
}

// Utility class
class Report {
    void calStudent(Student s) {
        System.out.println(s.fname + " " + s.calculateGrade());
    }

    void printGrade(Student[] students) {
        for (Student s : students) {
            System.out.println(s.fname + "  " + s.calculateGrade());
        }
    }
}

// Main class
public class StudentReport{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Report report = new Report();

        while (true) {
            System.out.println("\n--- Student Details ---");
            System.out.println("1. Science Student");
            System.out.println("2. Commerce Student");
            System.out.println("3. Arts Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 4) break;

            System.out.print("Enter Name: ");
            String fname = sc.next();
            System.out.print("Enter Marks Obtained: ");
            double marks = sc.nextDouble();
			
            switch (choice) {
                case 1:
                    report.calStudent(new ScienceStudent(fname, marks));
                    break;
                case 2:
                    report.calStudent(new CommerceStudent(fname, marks));
                    break;
                case 3:
                    report.calStudent(new ArtsStudent(fname, marks));
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
/*
--- Student Details ---
1. Science Student
2. Commerce Student
3. Arts Student
4. Exit
Enter choice: 1
Enter Name: dipak
Enter Marks Obtained: 60
dipak Fail

--- Student Details ---
1. Science Student
2. Commerce Student
3. Arts Student
4. Exit
Enter choice: 2
Enter Name: deep
Enter Marks Obtained: 300
deep A Grade

--- Student Details ---
1. Science Student
2. Commerce Student
3. Arts Student
4. Exit
Enter choice: 3
Enter Name: deep
Enter Marks Obtained: 70
deep B Grade

--- Student Details ---
1. Science Student
2. Commerce Student
3. Arts Student
4. Exit
Enter choice: 4 */
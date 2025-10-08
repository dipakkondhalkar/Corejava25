/*
Q2. Write a Java program with a default constructor to store Student details (rollNo, name, marks in 3 subjects).
 Operations:
Calculate total and average marks.
Display "Pass" if average ≥ 40, else "Fail".
Find and display the highest subject mark. */


import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    int rollNo;
    String name;
    String s1, s2, s3;
    int m1, m2, m3;

    // default constructor
    Student() {
        System.out.println("Enter Roll Number:");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter 3 Subject Names:");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Enter Marks for " + s1 + ", " + s2 + ", " + s3 + ":");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        if (average >= 40)
            System.out.println("Student Pass");
        else
            System.out.println("Student Fail");

        if (m1 >= m2 && m1 >= m3)
            System.out.println("Highest Marks in " + s1 + ": " + m1);
        else if (m2 >= m1 && m2 >= m3)
            System.out.println("Highest Marks in " + s2 + ": " + m2);
        else
            System.out.println("Highest Marks in " + s3 + ": " + m3);
    }
}

public class StudentDetail {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

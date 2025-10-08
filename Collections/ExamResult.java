/*Q25. Maintain exam results in a Map<String, Map<String, Integer>>, where:
Outer key = Student name
Inner map = Subject → Marks
Add/update marks for a subject.
Calculate each student’s average.
Find the student with the highest subject-wise average.
Explanation: Nested maps, updating values, and average computation*/

/*Q25. Maintain exam results in a Map<String, Map<String, Integer>>, where:
Outer key = Student name
Inner map = Subject → Marks

Operations:
- Add/update marks for a subject.
- Calculate each student’s average.
- Find the student with the highest subject-wise average.
*/

import java.util.*;

public class ExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Map<StudentName, Map<Subject, Marks>>
        Map<String, Map<String, Integer>> lhm = new LinkedHashMap<>();

        System.out.println("Enter the Details of Students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter the Name, Subject & Marks for Student " + (i + 1) + ": ");
            String name = sc.nextLine();
            String sub = sc.nextLine();
            int marks = sc.nextInt();
            sc.nextLine(); 
            
            Map<String, Integer> subjects = lhm.getOrDefault(name, new LinkedHashMap<>());
            subjects.put(sub, marks); 
            lhm.put(name, subjects);  
        }

       
        System.out.println("\nOriginal Data:");
        for (Map.Entry<String, Map<String, Integer>> student : lhm.entrySet()) {
            System.out.println("Student: " + student.getKey());
            for (Map.Entry<String, Integer> subj : student.getValue().entrySet()) {
                System.out.println("   " + subj.getKey() + " ---> " + subj.getValue());
            }
        }

       
        System.out.println("\nStudent Averages:");
        Map<String, Double> averages = new HashMap<>();
        for (Map.Entry<String, Map<String, Integer>> student : lhm.entrySet()) {
            int total = 0, count = 0;
            for (int marks : student.getValue().values()) {
                total += marks;
                count++;
            }
            double avg = (count > 0) ? (double) total / count : 0;
            averages.put(student.getKey(), avg);
            System.out.println(student.getKey() + " → Average = " + avg);
        }

        
        String topStudent = null;
        double maxAvg = -1;
        for (Map.Entry<String, Double> entry : averages.entrySet()) {
            if (entry.getValue() > maxAvg) {
                maxAvg = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("\nTopper: " + topStudent + " with average = " + maxAvg);
    }
}
/*
output:
Enter the Details of Students:

Enter the Name, Subject & Marks for Student 1:
dipak
phy
89

Enter the Name, Subject & Marks for Student 2:
onkar
phyis
73

Enter the Name, Subject & Marks for Student 3:
pranav
chen
99

Enter the Name, Subject & Marks for Student 4:
pratik
78
78

Enter the Name, Subject & Marks for Student 5:
pra
bio
90

Original Data:
Student: dipak
   phy ---> 89
Student: onkar
   phyis ---> 73
Student: pranav
   chen ---> 99
Student: pratik
   78 ---> 78
Student: pra
   bio ---> 90

Student Averages:
dipak ? Average = 89.0
onkar ? Average = 73.0
pranav ? Average = 99.0
pratik ? Average = 78.0
pra ? Average = 90.0

Topper: pranav with average = 99.0 */
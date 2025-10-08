/*Q18. Problem:
 You have employees with their department stored as Map<String, String> (employeeName → department). Perform the following:
Add 6 employees with departments.
Move an employee from one department to another.
Count how many employees belong to each department.
Remove employees from a given department (e.g., "HR").
Display department-wise employee lists.
Explanation:
Use put() to update department.
Create a new Map<String, List<String>> for grouping by department.
Remove entries using removeIf.
Iterate over grouped map to show department-wise employees.*/

import java.util.*;

public class EmployeeDepartmentMap {
    public static void main(String[] args) {
        // Step 1: Create Map to store employee → department
        Map<String, String> employeeDept = new HashMap<>();

        // Step 2: Add 6 employees with departments
        employeeDept.put("Alice", "HR");
        employeeDept.put("Bob", "IT");
        employeeDept.put("Charlie", "Finance");
        employeeDept.put("David", "IT");
        employeeDept.put("Eva", "HR");
        employeeDept.put("Frank", "Finance");

        System.out.println("Initial Employee-Department Map:");
        System.out.println(employeeDept);

        // Step 3: Move an employee from one department to another
        // Move Alice from HR to IT
        employeeDept.put("Alice", "IT");

        System.out.println("\nAfter moving Alice to IT:");
        System.out.println(employeeDept);

        // Step 4: Count employees in each department
        Map<String, Integer> deptCount = new HashMap<>();
        for (String dept : employeeDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nEmployee count per department:");
        for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Step 5: Remove employees from a given department (e.g., "HR")
        employeeDept.entrySet().removeIf(entry -> entry.getValue().equals("HR"));

        System.out.println("\nAfter removing employees from HR:");
        System.out.println(employeeDept);

        // Step 6: Group employees by departments
        Map<String, List<String>> deptEmployees = new HashMap<>();
        for (Map.Entry<String, String> entry : employeeDept.entrySet()) {
            String emp = entry.getKey();
            String dept = entry.getValue();

            // Add employee to the department list
			
            deptEmployees.putIfAbsent(dept, new ArrayList<>());
            deptEmployees.get(dept).add(emp);
        }

        // Step 7: Display department-wise employee lists
		
        System.out.println("\nDepartment-wise Employee List:");
        for (Map.Entry<String, List<String>> entry : deptEmployees.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

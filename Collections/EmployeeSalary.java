/*Q14. Write a program to manage employee salaries using HashMap<Integer, Double> 
where employee ID is the key and salary is the value.
Perform:
Insert 5 employees.
Increase salary of all employees by 10%.
Remove employees with salary less than 30,000.
Display the highest salary employee.
Explanation:
Demonstrates bulk update by iterating and modifying values.
Uses condition-based deletion with Iterator.
Finding max salary requires iterating through entrySet().*/

import java.util.*;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, Double> ls = new LinkedHashMap<>();

        System.out.println("Enter ID and Salary of 5 Employees (ID Salary):");
        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            double salary = sc.nextDouble();
            ls.put(id, salary);
        }

        System.out.println("\nOriginal Data:");
        for (Map.Entry<Integer, Double> entry : ls.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " ----> Salary: " + entry.getValue());
        }

        // 2. Increase salary by 10% for all employees
        for (Map.Entry<Integer, Double> entry : ls.entrySet()) {
            entry.setValue(entry.getValue() * 1.10); // multiply by 1.10 for +10%
        }

        System.out.println("\nAfter 10% Increment:");
        for (Map.Entry<Integer, Double> entry : ls.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " ----> Salary: " + entry.getValue());
        }

        // 3. Remove employees with salary < 30000
        Iterator<Map.Entry<Integer, Double>> it = ls.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Double> entry = it.next();
            if (entry.getValue() < 30000) {
                it.remove();
            }
        }

        System.out.println("\nAfter Removing Employees with Salary < 30000:");
        for (Map.Entry<Integer, Double> entry : ls.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " ----> Salary: " + entry.getValue());
        }

        // 4. Find and display the highest salary employee
        if (!ls.isEmpty()) {
            int highestId = -1;
            double highestSalary = 0.0;

            for (Map.Entry<Integer, Double> entry : ls.entrySet()) {
                if (entry.getValue() > highestSalary) {
                    highestSalary = entry.getValue();
                    highestId = entry.getKey();
                }
            }

            System.out.println("\nHighest Salary Employee:");
            System.out.println("ID: " + highestId + " ----> Salary: " + highestSalary);
        } else {
            System.out.println("\nNo employees left after filtering.");
        }


    }
}
output:
Enter ID and Salary of 5 Employees (ID Salary):
12
50000
13
300000
13
4000000
25
4000000
34
600000

Original Data:
ID: 12 ----> Salary: 50000.0
ID: 13 ----> Salary: 4000000.0
ID: 25 ----> Salary: 4000000.0
ID: 34 ----> Salary: 600000.0

After 10% Increment:
ID: 12 ----> Salary: 55000.00000000001
ID: 13 ----> Salary: 4400000.0
ID: 25 ----> Salary: 4400000.0
ID: 34 ----> Salary: 660000.0

After Removing Employees with Salary < 30000:
ID: 12 ----> Salary: 55000.00000000001
ID: 13 ----> Salary: 4400000.0
ID: 25 ----> Salary: 4400000.0
ID: 34 ----> Salary: 660000.0

Highest Salary Employee:
ID: 13 ----> Salary: 4400000.0

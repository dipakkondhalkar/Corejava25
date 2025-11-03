/*Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.*;
public class salary{
public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = (basicSalary <= 10000) ? basicSalary * 0.20 :
                     (basicSalary <= 20000) ? basicSalary * 0.25 :
                     basicSalary * 0.30;

        double da = (basicSalary <= 10000) ? basicSalary * 0.80 :
                    (basicSalary <= 20000) ? basicSalary * 0.90 :
                    basicSalary * 0.95;

        double grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary: " + grossSalary);
    }
}

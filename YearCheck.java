//Write a Java program to check whether a year is leap year or not.

import java.util.*;
public class YearCheck {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year =sc.nextInt();
		
		String result = (year % 4 == 0)? " Is a leap year ": " It is not leap year ";
		System.out.println(result);
		}
		}
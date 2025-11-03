// Write a Java program to check whether a number is divisible by 5 and 11 or not. 

import java.util.*;
public class DivisibleCheck{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the  first number");
int num1 = sc.nextInt();

System.out.println("Enter the second nummber");
int num2 =sc.nextInt();

String result = (num1% 5 ==0  && num2 % 11== 0)? " The number is divisible by both 5 and 11 ": " number not divisible by  5 and 11 ";

System.out.println(result );
}
}
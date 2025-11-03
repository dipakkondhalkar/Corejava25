// Write a Java program to check whether a number is divisible by 5 and 11 or not. 

import java.util.*;
public class DivisibleCheck1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number");
int num = sc.nextInt();

String result = (num% 5 ==0  && num % 11== 0)? " The number is divisible by both 5 and 11 ": " number not divisible by  5 and 11 ";

System.out.println(result );
}
//Enter the number
//55
// The number is divisible by both 5 and 11
}
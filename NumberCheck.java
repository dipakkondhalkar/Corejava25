
//Write a Java program to check whether a number is positive , negative or zero.

import java.util.*;
public class NumberCheck{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println(" Enter the number ");
int num = sc.nextInt();

String result =(num > 0) ? " number is positive ": (num == 0 )? " number is zero" :"number is negative ";
System.out.println(result);
}
}
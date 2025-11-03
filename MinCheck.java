/* Write a java program to find the minimum between two numbers. */

import java.util.*;
public class MinCheck{
public static void main(String[]args){

int num1 , num2 ;
Scanner sc= new Scanner (System.in);
System.out.println(" Enter the two numbers");
num1 = sc.nextInt();
num2 = sc.nextInt();

String result = ( num1 < num2 )? " First number is minimun ": " Second number is minimum ";
System.out.println(result);
}
}

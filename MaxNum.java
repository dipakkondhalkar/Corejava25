/*Write a java program to find the maximum between two numbers.*/

import java.util.*;
public class MaxNum{
public static void main(String[]args){

int num1 , num2 ;
Scanner sc = new Scanner(System.in);
System.out.println(" ENTER THE TWO NUMBERS");
num1 = sc.nextInt();
num2 = sc.nextInt();

String result= ( num1 > num2 ) ? " Num1 is maximum" : " Num2 is maximum";
System.out.println(result);
}
}
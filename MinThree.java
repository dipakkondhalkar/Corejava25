/*Write a java program to find a minimum between three numbers. */

import java.util.*;
public class MinThree{
public static void main(String[]args){
int num1 , num2 , num3 ;
Scanner sc= new Scanner(System.in);
System.out.println(" Enter the three numbers");
num1 = sc.nextInt();
num2 = sc.nextInt();
num3 = sc.nextInt();

int result = ( num1 < num2 )? (( num1 < num3 )? num1 : num2) :((num2 < num3)? num2 : num3) ; 
System.out.println(result);
}
}
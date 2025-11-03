/* Write a java program to accept two integers and check whether they are equal or not.
*/
import java.util.*;
public class IntegerCheck{
public static void main(String[]args){

int num1 , num2 ;
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the two number ");
num1 = sc.nextInt();
num2 = sc.nextInt();

String result = (num1 == num2 ) ? " Both numbers equal" : " Numbers are not equal";
System.out.println(result);
}
}



//Q.1 Write a java program to take 5 elements in a Array and display it.


import java.util.*;
public class DisplayNum{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int a[]= new int[5];

System.out.println(" Enter the five Integer");
for(int i=0;i<a.length; i++)
{
	a[i] =sc.nextInt();
}

System.out.println("Display array values");
for( int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
}
}
 // Enter the five Integer
// 1
// 2
// 3
// 4
// 5
// Display array values
// 1
// 2
// 3
// 4
// 5


//Q3. Write a program to input 5 elements in an integer array and print all elements.
//: Use a loop to store user input in the array and then use another loop to print them.


import java.util.*;
public class Array1Day1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int[]  a = new int[5];

System.out.println(" Enter five values in array");//Tell user to insert the numbers in array.
for(int i=0; i<a.length; i++)
{
a[i] = sc.nextInt();// store all number here.
}

for(int i=0; i<a.length ; i++)
{
 System.out.println("a["+ i +"]---->" + a[i]);//print values here.
 
 }
 }
}

// output:
// 1
// 2
// 4
// 3
// 4
// a[0]---->1
// a[1]---->2
// a[2]---->4
// a[3]---->3
// a[4]---->4

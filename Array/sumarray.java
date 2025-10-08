//Write a program to find the sum of all elements in an array.
//Explanation: Use a loop to iterate and keep adding the elements to a sum variable.


import java.util.*;
public class Array2Day1{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter count of number you want to add");
int n= sc.nextInt(); // Take count from user to add.
int[] a = new int[n];
int sum = 0;   //initialize sum
System.out.println("Enter all number which you want make sum");

for(int i = 0 ; i<n ; i++){
  a[i] = sc.nextInt();  // take input which we want to sum.
  
}
 for(int i=0; i<n; i++){
    sum = sum + a[i];  // ADD all numbers.	
 }

 System.out.println("sum is "+ sum);//print output here.

}
}

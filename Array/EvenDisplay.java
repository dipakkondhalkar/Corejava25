//Q.2 Write a java program to take 5 elements and display only even  number from array.

import java.util.*;
public class EvenDisplay{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println(" Enter the 5 elements ");

int a[]= new int[5];
 for(int i=0;i<a.length; i++)
 {
	 a[i] = sc.nextInt();
 }

System.out.println("Even Numbers are");
   for(int i=0 ; i<a.length; i++){
	   
	   if(a[i]%2==0){
		   
		   System.out.printf(" "+a[i]);
	   }
   }
}
}
 // Enter the 5 elements
// 12
// 4
// 2
// 3
// 4
 // Even number 12
 // Even number 4
 // Even number 2
 // Even number 4
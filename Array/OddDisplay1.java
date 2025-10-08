//Q.3 Write a java program to take 5 elements and display only odd elements from array.

import java.util.*;
public class OddDisplay1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println(" Enter the 5 elements ");

int a[]= new int[5];
 for(int i=0;i<a.length; i++)
 {
	 a[i] = sc.nextInt();
 }
   for(int i=0 ; i<a.length; i++){
	   
	   if(a[i]%2==1){
		   
		   System.out.println(" ODD number "+a[i]);
	   }
   }
}
}
// OUTPUT:
 // Enter the 5 elements
// 1
// 2
// 3
// 2
// 3
 // Even number 1
 // Even number 3
 // Even number 3
//Q.4 Write ajava program to take 5 elements and display elements which are multiple of 5.

import java.util.*;
public class MultiDisplay{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println(" Enter the 5 elements ");

int a[]= new int[5];
 for(int i=0;i<a.length; i++)
 {
	 a[i] = sc.nextInt();
 }
 for(int i=0 ; i<a.length; i++){
	   
	   if(a[i]%5==0){
		   
		   System.out.println(" Multiple number of "+a[i]);
	   }
   }
}
}

// output:
 // Enter the 5 elements
// 15
// 23
// 20
// 25
// 10
 // Multiple number of 15
 // Multiple number of 20
 // Multiple number of 25
 // Multiple number of 10

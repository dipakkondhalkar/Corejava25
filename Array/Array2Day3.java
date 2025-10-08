// Reverse order logic.


import java.util.*;
public class Array2Day3{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = sc.nextInt();
	
    int [] a = new int[n];
	System.out.println("Enter the size of array is " + n + "elements" );
	
	for(int i=1; i<n ;i++){
		
		a[i] = sc.nextInt();
	}   
	
	System.out.println("reverse of given array");
	for(int i=n-1; i>=0;i--){
		
	System.out.printf(a[i] +  "   ");
	}
	System.out.println();
}
}
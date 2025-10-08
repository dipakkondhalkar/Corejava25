//Q3. Count how many even and odd numbers are there in an array.
//Explanation: Use modulo operator % 2 to check even or odd.


import java.util.*;
public class Array1Day3{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array");
	int n = sc.nextInt();
	
    int [] a = new int[n];
	System.out.println("Enter the size of array is " + n + "elements" );
	
	for(int i=1; i<n ;i++){
		
		a[i] = sc.nextInt();
	}   
	int countEven=0 , countodd=0;
    for(int i=1 ; i<n;i++){
		
		if(a[i] % 2 == 0){
		  countEven++;
		  }
		  
		  else{
			  countodd++;
		  }
	}
		  System.out.println("COUNT OF Even numbers are" + countEven);
		  System.out.println("COUNT OF Odd numbers are " + countodd);
	}
}









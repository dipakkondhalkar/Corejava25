//Q1. Calculate the average of all elements in an array.
//Explanation: First calculate the sum, then divide by array length.

import java.util.*;
public class AverageArray1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size array");
int n = sc.nextInt();
int []a = new int[n];
  int sum =0;
	 System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();     // Store element
            sum = sum + a[i];
			
}
System.out.println("sum is =" + sum);
double avg = (double) sum / n;

        // Output result
        System.out.println("Average of array elements = " + avg);

}
}
/*output:
Enter the size array
5
Enter the elements of array:
1
2
3
4
5
sum is =15
Average of array elements = 3.0 */
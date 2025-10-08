/*2.Calculate the Average of an Array
o   Write a class to create a method to calculate the average of elements in an integer array.
 Explanation: Practice basic arithmetic operations and array traversal.
*/

import java.util.*;

class Number {
    int value;

    Number(int value) {
        this.value = value;
    }
}

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Number[] arr = new Number[5]; // Array of objects

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Number(sc.nextInt()); // store number inside object
        
		}

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].value;
        
		 }


        double avg = (double) sum / arr.length;
        System.out.println("Average of the given array is " + avg);
    }
}

/*
output:
Enter 5 numbers:
1
2
3
4
5
Average of the given array is 3.0  */















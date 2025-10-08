/*Q1. Write a java program to find the unique value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 3, 20, 12, 10 
*/

import java.util.*;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of size 10
        int[] a = new int[10];

        System.out.println("Enter 10 elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("All unique elements in the array are: ");
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

/*Q2. Write a java program to merge two arrays.

	Input - First Array :- 1 2 3 4 5
             	  Second Array :-  6 7 8 9 10 
*/

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        int[] a = new int[3];
        System.out.println("Enter 3 elements for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Second array
        int[] b = new int[3];
        System.out.println("Enter 3 elements for second array:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        // Merged array
        int[] c = new int[a.length + b.length];

        // Copy first array to c
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // Copy second array to c
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        // Print merged array
        System.out.println("Merged array:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

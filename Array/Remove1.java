/*Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0  */

import java.util.Scanner;

public class Remove1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();            

        int[] a = new int[n];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++) {    
            a[i] = sc.nextInt();
        }

        int index = 0;                   
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[index++] = a[i];
            }
        }

        
        while (index < n) {
            a[index++] = 0;
        }

        System.out.println("Array after moving zeroes to the end:");
        for (int value : a) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}
/*output:
Enter the size of array: 10
Enter the elements in array:
2
5
7
0
4
0
7
-5
8
0
Array after moving zeroes to the end:
2 5 7 4 7 -5 8 0 0 0
*/
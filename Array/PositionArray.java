/*Q1. Write a program in java to delete an element at desired position from an array.

	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output: The new list is : 1 2 3 5 */


import java.util.*;

public class PositionArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
        int[] a = new int[n]; // fixed array size

        System.out.println("Enter 5 elements in ascending order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the position to delete (1 to " + n + "): ");
        int p = sc.nextInt(); // position to delete

        if (p < 1 || p > n) {
            System.out.println("Please input valid input");
        } else {
            int[] newArr = new int[n - 1];
            int j = 0;

            for (int i = 0; i < n; i++) {
                if (i != p - 1) {
                    newArr[j++] = a[i];
                }
            }

            // Print the new array
            System.out.print("The list after delete is: ");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }

        sc.close();
    }
}
/*output:-1
2
3
4
5
Enter the position to delete (1 to 5): 2
The list after delete is: 1 3 4 5

*/
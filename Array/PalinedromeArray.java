

import java.util.*;

public class PalinedromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println(" Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Two-pointer check
        boolean flase = true;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                flag = false;
                break;
            }
            left++;
            right--;
        }

        // Output result
        if (flag) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
/* 
output:
Enter the size of the array: 5
Enter 5 elements:
1
3
4
3
1
The array is a palindrome.  */

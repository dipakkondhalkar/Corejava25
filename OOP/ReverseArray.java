/*4.Reverse an Array
o   Write a class to write a method to reverse the elements of an integer array.
 Explanation: Work with array indexing and swapping.  */
 
import java.util.*;

class Number {
    int value;
    Number(int value) {
        this.value = value;
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Number[] arr = new Number[5]; // Array of objects

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Number(sc.nextInt()); // store in object
        }

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left].value;
            arr[left].value = arr[right].value;
            arr[right].value = temp;
            left++;
            right--;
        }

        System.out.print("Array After reverse: ");
        for (i=0;i<n ;i++) {
            System.out.print(num.value + " ");
        }
    }
}

 // output:
 // Enter the elements in array
// 1
// 2
// 3
// 4
// 5
// Array After reverse: 5 4 3 2 1
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

/*1. Find the Maximum Value in an Array
o   Write a class with a method to find and return the maximum value in an integer array.
 Explanation: Learn how to traverse an array and find the largest element using methods.*/
import java.util.*;

class Number {
    int value;

    Number(int value) {
        this.value = value;
    }
}

public class MaxArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Number[] arr = new Number[5]; // Array of objects

        System.out.println("Enter elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Number(sc.nextInt()); // each object stores one value
        }

        int max = arr[0].value;
        int min = arr[0].value;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].value > max) {
                max = arr[i].value;
            }
            if (arr[i].value < min) {
                min = arr[i].value;
            }
        }

        System.out.println("Max is " + max + " Min is " + min);
    }
}

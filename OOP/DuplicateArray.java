/*5.    Find Duplicates in an Array
o   Write a class to create a method to identify and display duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.
 */
import java.util.Scanner;

class Number {
    int value;

    Number(int value) {
        this.value = value;
    }
}

public class DuplicateArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

      
        Number[] arr = new Number[n];

       System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = new Number(sc.nextInt());
        }

   
        System.out.println("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].value == arr[j].value) {
                    System.out.println(arr[i].value);
                }
            }
        }   
    }
}
/*
output:
Enter 5 integers:
2
1
2
23
4
Duplicate elements are:
2
*/
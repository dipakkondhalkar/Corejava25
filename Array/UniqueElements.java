/*Q1. Write a java program to find the unique value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 3, 20, 12, 10 
*/



public class UniqueElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
        //int n = a.length;

       // System.out.print("Input array elements: ");
       // for (int v : a) System.out.print(v + " ");
       // System.out.println();

        System.out.print("All unique elements in the array are: ");
        // For each element, check if it appears exactly once
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}

import java.util.*;

public class Problem5Replace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int no = sc.nextInt();
        int[] a = new int[no];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < no; i++) {
            a[i] = sc.nextInt();
        }

        // Replace negative values with 0
        for (int i = 0; i < no; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }

        // Print the updated array
        System.out.println("Updated array:");
        for (int i = 0; i < no; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
/*output:Enter the size of array: 5
Enter the array elements:
1
2
3
-2
-4
Updated array:
1 2 3 0 0
*/
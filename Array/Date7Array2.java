import java.util.*;

public class Date7Array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.println("Enter the values of first array:");
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Input for second array
        System.out.println("Enter the values of second array:");
        int[] b = new int[5]; 
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        // Merged array
        int[] c = new int[a.length + b.length];

        // Copy a[] into c[]
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // Copy b[] into c[] after a[]
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        // Print merged array
        System.out.println("Merged array =");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

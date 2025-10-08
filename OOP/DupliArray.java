import java.util.*;

class Array {
    int x[];

    void getData(int a[]) {
        x = a;
    }

    void showData() {
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < x.length; i++) {
            boolean isDuplicate = false;

            // Compare current element with elements ahead
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Ensure it's not already printed
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (x[i] == x[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (isDuplicate && !alreadyPrinted) {
                System.out.println(x[i]);
            }
        }
    }
}

public class DupliArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter the elements in the array:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Array s1 = new Array();
        s1.getData(a);
        s1.showData();
    }
}

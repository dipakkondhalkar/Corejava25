import java.util.Arrays;

public class ClosestSum {
    public static void main(String[] args) {
        int[] arr = {38, 44, 63, -51, -35, 19, 84, -69, 4, -46};
        int n = arr.length;

        System.out.println("The given array is: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        // Sort the array
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                num1 = arr[left];
                num2 = arr[right];
            }

            // Move pointers based on sum
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("\nThe Pair of elements whose sum is minimum are:");
        System.out.println("[" + num1 + ", " + num2 + "]");
    }
}

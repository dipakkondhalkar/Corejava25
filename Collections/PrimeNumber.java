/*Q3. Vector - Prime Numbers
Take N integers from user into a Vector.
Print only prime numbers.
Remove duplicates using Set logic with Vector.*/
import java.util.*;

public class PrimeNumber {

    // method to check prime number
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> v = new Vector<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        // another vector for prime numbers without duplicates
        Vector<Integer> primes = new Vector<>();

        // check primes and add if not already added
        for (int num : v) {
            if (isPrime(num) && !primes.contains(num)) {
                primes.add(num);
            }
        }

        System.out.println("Prime numbers (duplicates removed):");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
/*
output:
Enter number of elements: 10
Enter elements:
1
12
13
12
13
1
2
3
4
5
Prime numbers (duplicates removed):
13 2 3 5 */
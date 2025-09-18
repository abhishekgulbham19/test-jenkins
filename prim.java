import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // 0 and 1 are not prime numbers
        if (n <= 1) {
            return false;
        }

        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }

        // Check if n is divisible by any number from 2 up to its square root
        // We only need to check up to the square root because if a number 'n' has a divisor
        // greater than its square root, it must also have a divisor smaller than its square root.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }

        return true; // No divisors found, so it's prime
    }
}
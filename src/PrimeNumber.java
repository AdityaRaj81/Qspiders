// Write a Java Program to check if a number is prime.

import java.util.Scanner;

public class PrimeNumber {
    public static void isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                System.out.println(n + " is a prime number.");
            }
            else {
                System.out.println(n + " is not a prime number.");
            }
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.err.println("Error: Prime number is not defined for negative numbers.");
        } else {
            isPrime(number);
        }
        scanner.close();
    }
}

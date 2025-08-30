// Write a Java Program in order to find the factor of a number using function (both iterative and recursive).

import java.util.Scanner;

public class factor {

//    public static void factorOfNumber(int n) {
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i + " is the Factor of the " + n );
//            }
//        }
//    }

    // Recursive approach
    public static void factorOfNumber(int n) {
        System.out.println("Factors of " + n + " are:");
        factorHelper(n, 1);
    }

    private static void factorHelper(int n, int i) {
        if (i > n) {
            return;
        }
        if (n % i == 0) {
            System.out.println(i + " is a Factor of " + n);
        }
        factorHelper(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.err.println("Error: Factorial is not defined for negative numbers.");
        } else {
            factorOfNumber(number);
        }
        scanner.close();
    }
}

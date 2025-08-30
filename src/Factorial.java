import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive approach
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.err.println("Error: Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(number);
            System.out.println("The factorial of " + number + " is " + result);
        }

        scanner.close();
    }

}

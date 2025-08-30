// Write a java program to print all even numbers in a given range.

import java.util.Scanner;

public class EvenNumberInRange {
    public static void printEvenNumbers(int start, int end) {
        System.out.println("Even numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.err.println("Error: Start of the range should be less than or equal to the end.");
        } else {
            printEvenNumbers(start, end);
        }
        scanner.close();
    }
}

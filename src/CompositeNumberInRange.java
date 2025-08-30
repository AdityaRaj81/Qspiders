// Write a Java program to print all composite numbers in a given range.

import java.util.Scanner;

public class CompositeNumberInRange {
    public static void printCompositeNumbers(int start, int end) {
        System.out.println("Composite numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >2) {
                System.out.println(i + " is a Composite number.");
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
            printCompositeNumbers(start, end);
        }
        scanner.close();
    }
}

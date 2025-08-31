package Patterns;
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the type of pattern to bhe print: ");
        System.out.println("1. Right Triangle Star Pattern");
        System.out.println("2. Left Triangle Star Pattern");
        System.out.println("3. Pyramid Star Pattern");
        System.out.println("4. Inverted Pyramid Star Pattern");
        System.out.println("5. Diamond Star Pattern");
        System.out.println("6. Hollow Square Star Pattern");
        System.out.println("7. Hollow triangle Star Pattern");
        System.out.println("8. Hollow Diamond Star Pattern");
        System.out.println("9. Hollow Reverse Triangle Star Pattern");
        System.out.println("10. square Star Pattern");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter the number of rows for the Right Triangle Star Pattern: ");
                int rows1 = scanner.nextInt();
                rightTriangleStarPattern(rows1);
                break;
            case 2:
                System.out.println("Enter the number of rows for the Left Triangle Star Pattern: ");
                int rows2 = scanner.nextInt();
                LeftTriangleStarPattern(rows2);
                break;
            case 3:
                System.out.println("Enter the number of rows for Pyramid Star Pattern");
                int rows3 = scanner.nextInt();
                PyramidStarPattern(rows3);
                break;
            case 4:
                System.out.println("Enter the number of rows for Inverted Pyramid Star Pattern");
                int rows4 = scanner.nextInt();
                InvertedPyramidStarPattern(rows4);
                break;
            case 5:
                System.out.println("Enter the number of rows for Diamond Star Pattern");
                int rows5 = scanner.nextInt();
                DiamondStarPattern(rows5);
                break;
            case 6:
                System.out.println("Enter the number of rows for Hollow Square Star Pattern");
                int rows6 = scanner.nextInt();
                HollowSquareStarPattern(rows6);
                break;
            case 7:
                System.out.println("Enter the number of rows for Hollow triangle Star Pattern");
                int rows7 = scanner.nextInt();
                HollowTriangleStarPattern(rows7);
                break;
            case 8:
                System.out.println("Enter the number of rows for Hollow Diamond Star Pattern");
                int rows8 = scanner.nextInt();
                HollowDiamondStarPattern(rows8);
                break;
            case 9:
                System.out.println("Enter the number of rows for Hollow Reverse Triangle Star Pattern");
                int rows9 = scanner.nextInt();
                HollowReverseTriangleStarPattern(rows9);
                break;
            case 10:
                System.out.println("Enter the number of rows for square Star Pattern");
                int rows10 = scanner.nextInt();
                squareStarPattern(rows10);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pattern number.");
        }
    }
    public static void rightTriangleStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Print stars in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void LeftTriangleStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = rows; j >= i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // Print stars in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void PyramidStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars in each row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void InvertedPyramidStarPattern(int rows) {
        for (int i = rows; i >= 1; i--) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars in each row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void DiamondStarPattern(int rows) {
        // Upper Pyramid
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars in each row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
        // Lower Inverted Pyramid
        for (int i = rows - 1; i >= 1; i--) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars in each row
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void HollowSquareStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows; j++) { // Print stars and spaces in each row
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void HollowTriangleStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars and spaces in each row
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void HollowDiamondStarPattern(int rows) {
        // Upper Pyramid
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars and spaces in each row
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        // Lower Inverted Pyramid
        for (int i = rows - 1; i >= 1; i--) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars and spaces in each row
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void HollowReverseTriangleStarPattern(int rows) {
        for (int i = rows; i >= 1; i--) { // Loop through each row
            for (int j = rows; j > i; j--) { // Print spaces before stars
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars and spaces in each row
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void squareStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows; j++) { // Print stars in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}

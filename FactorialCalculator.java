import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();

        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Input validation loop
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume invalid input
            }
        }

        scanner.close(); // Close the scanner
        return number;
    }

    // Method to calculate the factorial of a given non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1; // Factorial of 0 is 1

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

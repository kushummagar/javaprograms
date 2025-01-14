import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number from the user
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number from the user
        double number2 = scanner.nextDouble();

        // Calculate the product of the two numbers
        double product = number1 * number2;

        // Display the result
        System.out.println("The product of " + number1 + " and " + number2 + " is: " + product);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}

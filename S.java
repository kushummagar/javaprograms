import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number from the user
         int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number from the user
        int number2 = scanner.nextInt();

        // Perform arithmetic operations
       int  sum = number1 + number2;
    int  product = number1 * number2;
      int  difference = number1 - number2;
    int    quotient = number1 / number2;
     int   remainder = number1 % number2;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the Scanner to avoid resource leaks
       scanner.close();
    }
}

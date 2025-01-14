import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");

        // Read the input from the user
        int number = scanner.nextInt();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Validate if the input is within the range [0, 1000]
        if (number < 0 || number > 1000) {
            System.out.println("Please enter a valid integer between 0 and 1000.");
        } else {
            // Calculate the sum of digits
            int sum = 0;
            int originalNumber = number;

            while (number > 0) {
                sum += number % 10; // Add the last digit
                number /= 10;       // Remove the last digit
            }

            // Display the result
            System.out.println("The sum of digits in " + originalNumber + " is: " + sum);
        }
    }
}

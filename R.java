// Import the Scanner class from java.util package
import java.util.Scanner;

// Define a class named MultiplicationTable   
public class R {

    // The main method, where the program execution begins
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the entered number from the user and store it in the 'number' variable
        int number = scanner.nextInt();

        // Print a header indicating the multiplication table for the entered number
        System.out.println("Multiplication table for " + number + ":");

        // Use a loop to calculate and print the multiplication table up to 10
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        // Close the Scanner to release resources
        scanner.close();
    }
}

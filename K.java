import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the input from the user
        double number = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Calculate the square, cube, and fourth power
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        // Display the results
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);
    }
}

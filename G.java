import java.util.Scanner;

public class G{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number in inches
        System.out.print("Enter the number in inches: ");

        // Read the input from the user
        double inches = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Convert inches to meters using the conversion factor (1 inch = 0.0254 meters)
        double meters = inches * 0.0254;

        // Display the result
        System.out.println(inches + " inches is equal to " + meters + " meters.");
    }
}

import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store the integer inputs
        int[] numbers = new int[10];
        
        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Print the integers entered by the user
        System.out.println("\nThe integers entered by the user are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
        
        // Close the Scanner object
        scanner.close();
    }
}

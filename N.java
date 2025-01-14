import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Number 3: ");
        double num3 = scanner.nextDouble();
        
        // Find the greatest number
        double greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }  
        if (num3 > greatest) {
            greatest = num3;
        }
        
        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);
        
        // Close the Scanner object
        scanner.close();
    }
}

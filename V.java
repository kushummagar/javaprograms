import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter an i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        nteger to display its multiplication table: ");
        int number = scanner.nextInt();
        
        // Display the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        // Close the Scanner object     scanner.close();  
    }
}
 
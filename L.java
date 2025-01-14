import java.util.Scanner;

public class L{
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number (between 1 and 7): ");
        int number = scanner.nextInt();
        
        // Check if the number is within the valid range
        if (number >= 1 && number <= 7) {
            // Determine the weekday name based on the number
            String weekdayName = "";
            switch (number) {
                case 1:
                    weekdayName = "Monday";
                    break;
                case 2:
                    weekdayName = "Tuesday";
                    break;
                case 3:
                    weekdayName = "Wednesday";
                    break;
                case 4:
                    weekdayName = "Thursday";
                    break;
                case 5:
                    weekdayName = "Friday";
                    break;
                case 6:
                    weekdayName = "Saturday";
                    break;
                case 7:
                    weekdayName = "Sunday";
                    break;
            }
            
            // Display the weekday name
            System.out.println("The weekday corresponding to the number " + number + " is: " + weekdayName);
        } 
        
        // Close the Scanner object
        scanner.close();
    }
}

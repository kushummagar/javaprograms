import java.util.Scanner;

public class Q{
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create an array of the specified size
        int[] array = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Calculate the sum of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        // Calculate the average value
        double average = (double) sum / size;
        
        // Display the average value
        System.out.println("The average value of array elements is: " + average);
        
        // Close the Scanner object
        scanner.close();
    }
}

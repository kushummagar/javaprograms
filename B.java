import java.util.Scanner;

public class B {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter temperature in Fahrenheit: ");

      
        double fahrenheit = scanner.nextDouble();

       
        scanner.close();

        
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Temperature in Celsius: " + celsius);
    }
}

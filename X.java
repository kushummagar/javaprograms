    import java.util.Scanner;

    
    public class X{
     public static void main(String[] args) {
>>         // Create a Scanner object to read input from the user
>>         Scanner scanner = new Scanner(System.in);
>>
>>         // Prompt the user to enter temperature in Fahrenheit
>>         System.out.print("Enter temperature in Fahrenheit: ");
>>
>>         // Read the entered temperature in Fahrenheit
>>         double fahrenheit = scanner.nextDouble();
>> 
>>         // Close the Scanner to avoid resource leak
>>         scanner.close();
>>
>>         // Convert Fahrenheit to Celsius using the conversion formula
>>         double celsius = (fahrenheit - 32) * 5/9;
>>
>>         // Display the result
>>         System.out.println("Temperature in Celsius: " + celsius);
>>     }
>> }
>>
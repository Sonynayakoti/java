import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("Select the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        double temperature;
        double convertedTemperature = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature * 9/5) + 32;
                System.out.println(temperature + " Celsius = " + convertedTemperature + " Fahrenheit");
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemperature = temperature + 273.15;
                System.out.println(temperature + " Celsius = " + convertedTemperature + " Kelvin");
                break;
            case 3:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature - 32) * 5/9;
                System.out.println(temperature + " Fahrenheit = " + convertedTemperature + " Celsius");
                break;
            case 4:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature - 32) * 5/9 + 273.15;
                System.out.println(temperature + " Fahrenheit = " + convertedTemperature + " Kelvin");
                break;
            case 5:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                convertedTemperature = temperature - 273.15;
                System.out.println(temperature + " Kelvin = " + convertedTemperature + " Celsius");
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature - 273.15) * 9/5 + 32;
                System.out.println(temperature + " Kelvin = " + convertedTemperature + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 6.");
                break;
        }

        scanner.close();
    }
}

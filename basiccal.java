import java.util.Scanner;

public class basiccal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int operator = scanner.nextInt();

        System.out.print("Enter first number: ");
        double fnum = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double snum = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case 1:
                result = fnum + snum;
                break;
            case 2:
                result = fnum - snum;
                break;
            case 3:
                result = fnum * snum;
                break;
            case 4:
                if (snum != 0) {
                    result = fnum / snum;
                } else {
                    System.out.println("Cannot divide by zero.");
                    scanner.close(); // Close the scanner before returning
                    return; // Exit if there's a divide by zero error
                }
                break;
            default:
                System.out.println("Invalid operator.");
                scanner.close(); // Close the scanner before returning
                return; // Exit if the operator is invalid
        }

        System.out.println("Result is " + result);

        scanner.close(); // Close the scanner
    } // Closing brace for the main method
} // Closing brace for the BasicCal class

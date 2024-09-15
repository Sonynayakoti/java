import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Define the range for the random number
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int userGuess = -1;  // Initialize with an invalid value
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        // Game loop
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < lowerBound || userGuess > upperBound) {
                    System.out.println("Please guess a number between " + lowerBound + " and " + upperBound + ".");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}

package game;

import java.util.Random;
import java.util.Scanner;

public class Controller 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int userGuess = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (userGuess != secretNumber) {
            try 
            {
                System.out.print("Guess the number between 1 and 100: ");
                userGuess = scanner.nextInt();
                
                attempts++;
                
                if (userGuess < secretNumber)
                {
                    System.out.println("Too low! Try again.");
                } 
                else if (userGuess > secretNumber) 
                {
                    System.out.println("Too high! Try again.");
                }
            } 
            catch (java.util.InputMismatchException e) 
            {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        scanner.close();
        
        System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
    }
}

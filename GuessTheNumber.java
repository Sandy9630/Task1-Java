import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int round = 1;
System.out.println("-----------------------------------------------------------------------");
        System.out.println("Welcome to the Guess the Number Game!");
System.out.println("-----------------------------------------------------------------------");

        while (true) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 0;
            int maxAttempts = 7 ;
            boolean hasGuessed = false;

            System.out.println("Round " + round);
System.out.println("-----------------------------------------------------------------------");
            System.out.println("I'm thinking of a number between 1 and 100");
System.out.println("-----------------------------------------------------------------------");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");
System.out.println("-----------------------------------------------------------------------");
            while (numberOfAttempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Try a higher number.");
System.out.println("-----------------------------------------------------------------------");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Try a lower number");
System.out.println("-----------------------------------------------------------------------");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + numberOfAttempts + " attempts.");
System.out.println("-----------------------------------------------------------------------");
                    int points = maxAttempts - numberOfAttempts + 1;
                    totalScore += points;
                    System.out.println("You earned " + points + " points. Total score: " + totalScore);
System.out.println("-----------------------------------------------------------------------");
                    hasGuessed = true;
                    break;

                }
            }

            if (!hasGuessed) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + numberToGuess);
System.out.println("-----------------------------------------------------------------------");
            }

            System.out.print("Do you want to play another round? (yes/no): ");

            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            round++;
System.out.println("-----------------------------------------------------------------------");
        }
System.out.println("-----------------------------------------------------------------------");
        System.out.println("Game over! Your total score is: " + totalScore);
        scanner.close();

System.out.println("-----------------------------------------------------------------------");
    }
}
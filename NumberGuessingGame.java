import java.util.Scanner;

public class NumberGuessingGame {
    private int secretNumber;
    private int attempts;
    private Scanner scanner;

    public NumberGuessingGame() {
        this.secretNumber = (int) (Math.random() * 100) + 1;
        this.attempts = 0;
        this.scanner = new Scanner(System.in);
    }

    public void play() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess a number between 1 and 100.");

        int guess;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                guessedCorrectly = true;
            }
        }

        scanner.close();
    }
}

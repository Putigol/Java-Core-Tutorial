import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max) + min;
        int guess;
        int attempts = 0;

        System.out.println("Number guessing game");
        System.out.printf("Guess a number between %d and %d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low, try again");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct!");
                System.out.println("The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
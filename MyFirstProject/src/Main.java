import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
            return;
        } catch (IOException e) {
            System.out.println("Something went wrong");
            return;
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman");
        System.out.println("************************");

        while (wrongGuesses < 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("You win! The word was: " + word);
                    break;
                }
            } else {
                System.out.println("Wrong guess");
                wrongGuesses++;
            }

            if (wrongGuesses >= 6) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("Game over! The word was: " + word);
            }
        }
        scanner.close();
    }

    public static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> "\n\n\n";
            case 1 -> "O\n\n\n";
            case 2 -> "O\n|\n\n";
            case 3 -> "O\n/|\n\n";
            case 4 -> "O\n/|\\n\n";
            case 5 -> "O\n/|\\n/\n";
            case 6 -> "O\n/|\\n/ \\";
            default -> "";
        };
    }
}
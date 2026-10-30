import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("***************************");
        System.out.println("   Welcome to Java Slots   ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐️");
        System.out.println("***************************");

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than zero");
                continue;
            }

            balance -= bet;

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry, you lost this round");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("Game over! Your final balance is $" + balance);
        scanner.close();
    }

    public static String[] spinRow() {
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐️"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    public static void printRow(String[] row) {
        System.out.println(" * " + String.join(" | ", row) + " *");
    }

    public static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch (row[0]) {
                case "🍒": return bet * 3;
                case "🍉": return bet * 4;
                case "🍋": return bet * 5;
                case "🔔": return bet * 10;
                case "⭐️": return bet * 20;
            }
        } else if (row[0].equals(row[1])) {
            switch (row[0]) {
                case "🍒": return bet * 2;
                case "🍉": return bet * 3;
                case "🍋": return bet * 4;
                case "🔔": return bet * 5;
                case "⭐️": return bet * 10;
            }
        } else if (row[1].equals(row[2])) {
            switch (row[1]) {
                case "🍒": return bet * 2;
                case "🍉": return bet * 3;
                case "🍋": return bet * 4;
                case "🔔": return bet * 5;
                case "⭐️": return bet * 10;
            }
        }
        return 0;
    }
}
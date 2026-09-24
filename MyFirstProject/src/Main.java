import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your new username: ");
        String username = scanner.nextLine();

// Kiểm tra độ dài (4-12 ký tự)
        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 through 12 characters");
        }
// Kiểm tra ký tự không hợp lệ (space hoặc underscore)
        else if(username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + username);
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 1. Mảng câu hỏi
        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?"
        };

        // 2. Mảng 2 chiều chứa các tùy chọn
        String[][] options = {
                {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. Cobalt", "2. C", "3. Fortran", "4. Assembly"}
        };

        // 3. Mảng đáp án đúng (dạng số nguyên)
        int[] answers = {3, 1, 2, 4, 3};

        // 4. Biến khởi tạo
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int guess;

        System.out.println("Welcome to the Java quiz game!\n******************************");

        // 5. Vòng lặp chính
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // 6. Kiểm tra đáp án
            if (guess == answers[i]) {
                System.out.println("Correct!\n******************************");
                score++;
            } else {
                System.out.println("Wrong!\n******************************");
            }
        }

        // 7. Hiển thị kết quả
        System.out.println("Your final score is " + score + " out of " + questions.length);

        scanner.close();
    }
}
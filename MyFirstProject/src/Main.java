import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number of food do you want: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ đệm sau khi nhập số

        String[] foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("Here is your food:");
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
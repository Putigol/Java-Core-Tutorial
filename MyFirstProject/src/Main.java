import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);


            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY, PIZZA_DAY -> System.out.println("It is the weekend");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day");
        }
        scanner.close();
    }
}
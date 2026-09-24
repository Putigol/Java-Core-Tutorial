import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = "";
        System.out.println("Enter a day of the week: ");
        day = scanner.nextLine();
        switch (day) {
            case "Monday" -> System.out.println("Monday");
            case "Tuesday" -> System.out.println("Tuesday");
            case  "Wednesday" -> System.out.println("Wednesday");
            case "Thursday" -> System.out.println("Thursday");
            case "Friday" -> System.out.println("Friday");
            case "Saturday" -> System.out.println("Saturday");
            case "Sunday" -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
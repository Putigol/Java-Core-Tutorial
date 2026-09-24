import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp = 20;
        boolean isSunny = true;

// Sử dụng && (AND)
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good and it is sunny outside");
        }
// Sử dụng ! (NOT)
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("It is cloudy outside");
        }
// Sử dụng || (OR)
        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int target = 2;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array");
        }
        String[] fruits = {"apple", "orange", "banana"};
        String tar = "orange";

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(tar)) {
                System.out.println("Element found at index " + i);
            }
        }
    }
}
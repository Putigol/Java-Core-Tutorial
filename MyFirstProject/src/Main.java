import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Nhóm 1: Kiểm tra tên
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Bạn chưa nhập tên!  pouty face");
        } else {
            System.out.println("Xin chào " + name + "! smiley face");
        }

// Nhóm 2: Kiểm tra tuổi
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        if (age >= 65) {
            System.out.println("Bạn là người cao tuổi! grandpa");
        } else if (age >= 18) {
            System.out.println("Bạn là người trưởng thành! adult");
        } else if (age >= 0) {
            System.out.println("Bạn là trẻ em! child");
        } else {
            System.out.println("Bạn chưa được sinh ra! spirit");
        }

// Nhóm 3: Kiểm tra sinh viên
        System.out.print("Bạn có phải là sinh viên không? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent) {
            System.out.println("Bạn là sinh viên! school");
        } else {
            System.out.println("Bạn không phải là sinh viên! office");
        }

        scanner.close();
    }
}
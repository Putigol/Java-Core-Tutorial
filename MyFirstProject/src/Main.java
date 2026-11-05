import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
// Khởi tạo ArrayList chứa các loại trái cây
        ArrayList<String> fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("coconut");

        // Các thao tác cơ bản
        fruits.remove(0);         // Xóa phần tử tại index 0
        fruits.set(0, "pineapple"); // Thay thế phần tử tại index 0

        // Sắp xếp
        Collections.sort(fruits);

        // Duyệt qua danh sách
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
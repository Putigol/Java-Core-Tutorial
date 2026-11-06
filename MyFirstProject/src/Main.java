import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
// Tạo HashMap
        HashMap<String, Double> map = new HashMap<>();

        // Thêm phần tử (put method)
        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.25);
        map.put("Coconut", 1.00);

        // Xóa phần tử (remove method)
        map.remove("Apple");

        // Lấy giá trị (get method)
        // System.out.println(map.get("Coconut"));

        // Kiểm tra key hoặc value
        // System.out.println(map.containsKey("Banana"));
        // System.out.println(map.containsValue(1.0));

        // Duyệt qua map sử dụng keySet
        for (String key : map.keySet()) {
            System.out.println(key + ": $" + map.get(key));
        }
    }
}
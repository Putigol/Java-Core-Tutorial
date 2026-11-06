public class Main {
    public static void main(String[] args) {
// Sử dụng lớp Box với String (7:05-7:53)
        Box box = new Box<>();
        box.setItem("Banana");
        System.out.println(box.getItem());

        // Sử dụng lớp Box với Integer (8:02-8:20)
        Box intBox = new Box<>();
        intBox.setItem(3);
        System.out.println(intBox.getItem());

        // Sử dụng lớp Product với String và Double (10:52-12:30)
        Product product1 = new Product<>("Apple", 0.5);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        // Sử dụng lớp Product với String và Integer (12:51-13:26)
        Product product2 = new Product<>("Ticket", 15);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
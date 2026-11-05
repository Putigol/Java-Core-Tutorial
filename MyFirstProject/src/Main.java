public class Main {
    public static void main(String[] args) {

        // Họ giúp bảo vệ dữ liệu đối tượng và thêm các quy tắc để truy cập hoặc sửa đổi chúng.
        // GETTERS = Các phương thức làm cho một trường có thể ĐỌC được.
        // SETTERS = Các phương thức làm cho một trường có thể GHI được.

        Car car = new Car("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
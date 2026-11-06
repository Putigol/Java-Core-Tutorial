public class Main {
    public static void main(String[] args) {

        // Anonymous class = Một lớp không có tên. Không thể tái sử dụng.
        // Thêm hành vi tùy chỉnh mà không cần tạo lớp mới.
        // Thường dùng cho các trường hợp sử dụng một lần (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
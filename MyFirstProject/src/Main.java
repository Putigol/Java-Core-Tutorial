import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
// Khởi tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();

        // Tạo tác vụ TimerTask với lớp ẩn danh (anonymous class)
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                if (count > 0) {
                    System.out.println(count);
                    count--;
                } else {
                    System.out.println("Happy New Year");
                    timer.cancel(); // Dừng bộ đếm thời gian
                }
            }
        };

        // Lên lịch thực thi tác vụ: bắt đầu ngay (0) và lặp lại mỗi 1 giây (1000ms)
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
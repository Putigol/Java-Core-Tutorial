import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        // Timer = Lớp dùng để lập lịch thực hiện các tác vụ
        // TimerTask = Đại diện cho tác vụ sẽ được thực thi

        Timer timer = new Timer();

        TimerTask task = new TimerTask(){
            int count = 3; // Ví dụ về biến đếm để dừng tác vụ

            @Override
            public void run(){
                System.out.println("Hello!");
                count--;

                if (count <= 0) {
                    System.out.println("Task complete");
                    timer.cancel(); // Hủy Timer sau khi hoàn thành
                }
            }
        };

        // Lập lịch thực hiện tác vụ ngay lập tức (0ms) và lặp lại mỗi 1000ms (1 giây)
        timer.schedule(task, 0, 1000);
    }
}
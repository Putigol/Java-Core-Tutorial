public class MyRunnable implements Runnable {

    private final String text;

    public MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(text);
            try {
                Thread.sleep(1000); // Tạm dừng 1 giây
            } catch (InterruptedException e) {
                System.out.println("Thread bị gián đoạn");
            }
        }
    }
}
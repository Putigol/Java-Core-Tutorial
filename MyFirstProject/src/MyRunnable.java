public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Timer: " + i + " seconds");
        }
        System.out.println("Time's up!");
        System.exit(0);
    }
}
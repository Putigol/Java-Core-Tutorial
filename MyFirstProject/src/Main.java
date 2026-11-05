import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("Music.wav"); // Thay đổi tên file theo file .wav của bạn

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Nhập lựa chọn của bạn: ");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case ("P") -> clip.start();
                    case ("S") -> clip.stop();
                    case ("R") -> clip.setMicrosecondPosition(0);
                    case ("Q") -> clip.close();
                    default -> System.out.println("Lựa chọn không hợp lệ");
                }
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
        System.out.println("Tạm biệt!");
        scanner.close();
    }
}
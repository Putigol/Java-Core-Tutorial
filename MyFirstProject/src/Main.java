import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Cách làm việc với NGÀY & GIỜ trong Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        // Ngày hiện tại
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // Giờ hiện tại
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // Ngày và giờ hiện tại
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // Dấu thời gian UTC (UTC timestamp)
        Instant instant = Instant.now();
        System.out.println(instant);

        // Định dạng tùy chỉnh
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // So sánh ngày & giờ
        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0); // GIÁNG SINH
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0); // NGÀY NĂM MỚI

        if(date1.isBefore(date2)){
            System.out.println(date1 + " sớm hơn " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + " muộn hơn " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " bằng với " + date2);
        }
    }
}





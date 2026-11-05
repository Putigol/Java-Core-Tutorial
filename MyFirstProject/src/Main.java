import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Các phương pháp ghi file phổ biến:
        // FileWriter = Cho file văn bản nhỏ hoặc trung bình
        // BufferedWriter = Hiệu suất cao hơn cho nhiều dữ liệu
        // PrintWriter = Tốt nhất cho dữ liệu có cấu trúc
        // FileOutputStream = Tốt nhất cho file nhị phân

        String filePath = "test.txt";
        String textContent = """
            Roses are Red
            Violets are Blue
            BOOTY BOOTY BOOTY
            ROCKIN' EVERWHERE!
            """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
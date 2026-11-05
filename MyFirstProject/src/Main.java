import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Đường dẫn file cần đọc
        String filePath = "C:\\Users\\Admin\\Downloads\\VerbaGuard_English ẩn tác giả.docx";

        // Sử dụng try-with-resources để tự động đóng reader
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            // Đọc file từng dòng cho đến khi hết dữ liệu (null)
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
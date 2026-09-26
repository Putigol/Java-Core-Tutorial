
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 10; i>0; i-=2) {
//            System.out.println(i);
//        }

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter how many times you want to loop: ");
//    int max = scanner.nextInt();
//
//    for (int i = 0; i < max; i++) {
//        System.out.println("Loop iteration: " + i);
//    }

      Scanner scanner=new Scanner(System.in);
      System.out.println(" How many times you want to loop: ");
      int start=10;

      for (int i=0;i>0;i--){
        System.out.println(i);
        Thread.sleep(1000);
      }

      System.out.println("Happy New Year!");
    }

}
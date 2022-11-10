import java.util.Scanner;

public class Else {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();
            if (a > 10) {
                  System.out.println("more than 10");
            }
            else if (a < 10) {
                  System.out.println("less than 10");
            }
            else {
                  System.out.println("equal to 10");
            }

      }
}

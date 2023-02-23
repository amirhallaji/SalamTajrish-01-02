import java.util.Scanner;

public class Power {
      public static int myPower(int a, int b) {
            int result = 1;
            for (int i = 0; i < b; i++) {
                  result *= a;
            }

            return result;
      }
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();

            int num = myPower(a, b);
            System.out.println(num);

            scan.close();
      }
}
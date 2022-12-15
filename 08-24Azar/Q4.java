import java.util.Scanner;

public class Q4 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a, b;
            a = scan.nextInt();
            b = scan.nextInt();

            boolean divisable = false, firstPrinted = false;
            for (int i = a; i <= b; i++) {
                  for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                              divisable = true;
                              break;
                        }
                  }
                  if (!divisable && i != 1 && i != 0) {
                        if (!firstPrinted) {
                              System.out.print(i);
                        } else {
                              System.out.print("," + i);
                        }

                        firstPrinted = true;
                  }
                  divisable = false;
            }

            scan.close();
      }
}

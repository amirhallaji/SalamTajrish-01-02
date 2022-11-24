import java.util.Scanner;

public class while1 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int i = 1, sum = 0;

            while (i <= n) {
                  sum += i++;
            }

            System.out.println(sum);

            scan.close();
      }
}

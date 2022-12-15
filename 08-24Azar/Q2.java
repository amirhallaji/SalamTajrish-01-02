import java.util.Scanner;

public class Q2 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            long n = scan.nextLong();

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                  if(i % 2 == 0) {
                        sum += (Math.pow(10, i) - 1) * -1;
                  }
                  else {
                        sum += Math.pow(10, i) - 1;
                  }
            }
            System.out.println(sum);

            scan.close();
      }
}

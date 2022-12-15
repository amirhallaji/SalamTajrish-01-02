import java.util.Scanner;

public class Q5 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n, m;
            n = scan.nextInt();
            m = scan.nextInt();

            int candy = 0, candyWrapper = 0;

            for(int i = 0; i < n; i++) {
                  candy++;
                  candyWrapper++;
                  if (candyWrapper == m) {
                        candyWrapper = 1;
                        candy++;
                  }
            }

            System.out.println(candy);
            
            scan.close();
      }
}

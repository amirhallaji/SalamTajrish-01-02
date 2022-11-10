import java.util.Scanner;

public class Q4 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a, b, c, d, e;
            a = scan.nextInt(); 
            b = scan.nextInt(); 
            c = scan.nextInt(); 
            d = scan.nextInt(); 
            e = scan.nextInt(); 

            int odd = a % 2 + b % 2 + c % 2 + d % 2 + e % 2;

            System.out.println(5 - odd + " " + odd);

            scan.close();
      }
}

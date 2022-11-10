import java.util.Scanner;

public class Q3 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a, b, c;
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

            int max = a;
            max = max > b ? max : b;
            max = max > c ? max : c;

            int min = a;
            min = min < b ? min : b;
            min = min < c ? min : c;

            System.out.println(min + max);

            scan.close();
      }
}

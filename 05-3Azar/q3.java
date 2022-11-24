import java.util.*;

public class q3 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int d, n;
            d = scan.nextInt();
            n = scan.nextInt();

            switch ((d + n) % 7) {
                  case 0 -> System.out.println("Friday");
                  case 1 -> System.out.println("Saturday");
                  case 2 -> System.out.println("Sunday");
                  case 3 -> System.out.println("Monday");
                  case 4 -> System.out.println("Tuesday");
                  case 5 -> System.out.println("Wednesday");
                  case 6 -> System.out.println("Thursday");
            }
            scan.close();
      }
}

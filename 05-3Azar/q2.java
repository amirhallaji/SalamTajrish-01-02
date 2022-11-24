import java.util.*;

public class q2 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int x1, y1, x2, y2;

            x1 = scan.nextInt();
            y1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();

            if (x1 == x2) {
                  System.out.println("Vertical");
            }
            else if(y1 == y2) {
                  System.out.println("Horizontal");
            }
            else {
                  System.out.println("Can't see");
            }

            scan.close();

      }
}

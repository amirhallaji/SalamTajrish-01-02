import java.util.*;
import java.lang.*;;

public class q5 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int x1, y1, r1, x2, y2, r2;
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            r1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();
            r2 = scan.nextInt();

            double d = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));

            if (d < Math.abs(r1 - r2)) {
                  System.out.println(0);
            }
            else if(d < r1 + r2 && d > Math.abs(r1 - r2)) {
                  System.out.println(2);
            }
            else if (d == Math.abs(r1 - r2) || d == r1 + r2) {
                  System.out.println(1);
            }
            else {
                  System.out.println(0);
            }

            
      }
}

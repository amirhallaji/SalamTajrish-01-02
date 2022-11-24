import java.util.*;

public class q1 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int x1, y1, x2, y2, x3, y3, x4, y4;

            x1 = scan.nextInt();
            y1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();
            x3 = scan.nextInt();
            y3 = scan.nextInt();
            x4 = scan.nextInt();
            y4 = scan.nextInt();

            double deltaX12, deltaX34, deltaY12, deltaY34;

            deltaX12 = x2 - x1;
            deltaX34 = x4 - x3;
            deltaY12 = y2 - y1;
            deltaY34 = y4 - y3;

            if (deltaX12 == 0) {
                  if (deltaY34 == 0) {
                        System.out.println("Yes");
                  }
            } else if (deltaX34 == 0) {
                  if (deltaY12 == 0) {
                        System.out.println("Yes");
                  }
            } else if ((deltaY12 / deltaX12) * (deltaY34 / deltaX34) == -1) {
                  System.out.println("Yes");
            } else {
                  System.out.println("No");
            }
            scan.close();
      }
}

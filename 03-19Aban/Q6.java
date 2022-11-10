import java.util.*;;

public class Q6 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a1, a2, a3, a4, a5;

            a1 = scan.nextInt();
            a2 = scan.nextInt();
            a3 = scan.nextInt();
            a4 = scan.nextInt();
            a5 = scan.nextInt();

            int b1, b2, b3, b4;
            b1 = a2 - a1;
            b2 = a3 - a2;
            b3 = a4 - a3;
            b4 = a5 - a4;

            int c1, c2, c3;
            c1 = b2 - b1;
            c2 = b3 - b2;
            c3 = b4 - b3;

            int d1, d2;
            d1 = c2 - c1;
            d2 = c3 - c2;

            int e = d2 - d1;

            System.out.println(e);
            
            scan.close();
      }
}

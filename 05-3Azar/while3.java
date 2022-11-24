import java.util.*;

public class while3 {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double a, b, step;

            a = input.nextInt();
            b = input.nextInt();
            step = input.nextDouble();
            
            while(a < b) {
                  System.out.println(a);
                  a += step;
            }
      }
}

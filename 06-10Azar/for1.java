import java.util.*;

public class for1 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int sum = 0;
            for (int i = 1; i < n + 1; i++){
                  sum += i;
            }
            
            System.out.println(sum);

            scan.close();
      }
}
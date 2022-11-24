import java.util.*;

public class fibo {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n  = scan.nextInt();
            int a = 1, b = 1;
            int c;
            System.out.print(a + " " + b + " ");
            while(n - 2 != 0){
                  c = a + b;
                  a = b;
                  b = c;
                  System.out.print(c + " ");
                  n--;
            }
      }
}
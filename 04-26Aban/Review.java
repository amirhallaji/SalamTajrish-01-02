import java.util.*;;

public class Review {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();
            int c = 3;

            if (a > 23) {
                  int b = scan.nextInt();
                  if (b == 34) {
                        System.out.println("b is equal to 34");
                  }
                  System.out.println("Greater than 23 " + b);
            }
            else if (a < 23) {
                  System.out.println("Less than 23");
            }
            else {
                  System.out.println("Equal to 23");
            }
      }
}
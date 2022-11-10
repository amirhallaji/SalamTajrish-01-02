import java.util.*;;

public class If {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();

            if (a > 10) {
                  System.out.println("more than 10");
                  a++;
            }
            System.out.println(a);

            scan.close();
      }
}

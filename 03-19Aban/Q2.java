import java.util.*;;

public class Q2 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            char ch1, ch2;
            ch1 = scan.next().charAt(0);
            ch2 = scan.next().charAt(0);

            char smaller = ch1 < ch2 ? ch1 : ch2;

            System.out.printf("\"%c\" -> code = %d", smaller, (int)smaller);

            scan.close();
      }      
}

import java.util.Scanner;

public class Chars {
      public static char toggleChar(char ch) {
            if ((int)ch >= 65 && (int)ch <= 96) {
                  return (char)((int)ch + 32);
            }

            return (char)((int)ch - 32);
      }
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            char ch = scan.next().charAt(0);
            System.out.println(toggleChar(ch));

            scan.close();
      }
}

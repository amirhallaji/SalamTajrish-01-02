import java.util.*;

public class Username {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            String username = scan.next();
            int flag = 0;
            for(int i = 0; i < username.length(); i++) {
                  switch(username.charAt(i)) {
                        case ',' -> flag = 1;
                        case ';' -> flag = 1;
                        case '!' -> flag = 1;
                        case '%' -> flag = 1;
                        case '<' -> flag = 1;
                        case '>' -> flag = 1;
                        case '(' -> flag = 1;
                        case ')' -> flag = 1;
                        case '$' -> flag = 1;
                  }
                  if (flag == 1) {
                        break;
                  }
            }

            if (flag == 1) {
                  System.out.println("INVALID");
            }
            else {
                  System.out.println("VALID");
            }

            scan.close();
      }
}

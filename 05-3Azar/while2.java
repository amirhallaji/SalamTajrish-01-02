import java.util.*;;

public class while2 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            int n;
            
            // do while
            do {
                  n = scan.nextInt();
                  System.out.println(n);
            }while(n != 0);

            scan.close();
      }
}

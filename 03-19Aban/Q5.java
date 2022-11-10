import java.util.*;;

public class Q5 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt(); // 123
            int newNumber = (a % 10) * 100;  // new = 300

            a -= a % 10; // a = 120
            a /= 10; // a = 12
            
            newNumber += (a % 10) * 10; // new = 300 + 20 = 320

            a /= 10; // a = 1

            newNumber += a; 

            System.out.println(newNumber);

            scan.close();
      }
}

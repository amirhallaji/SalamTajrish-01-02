import java.util.Scanner;

public class Complete {
      public static boolean isComplete(int a) {
            int sum = 0;
            for(int i = 1; i < a; i++) {
                  if (a % i == 0) {
                        sum += i;
                  }
            }

            return a == sum;
      }

      public static void printCompleteNumbers(int a, int b) {
            for(int i = a; i <= b; i++) {
                  if(isComplete(i)) {
                        System.out.println(i);
                  }
            }
      }

      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();

            printCompleteNumbers(a, b);

            scan.close();
      }      
}

import java.util.Scanner;

public class Happy {
      public static boolean isHappy(int a) {
            return a == 1;
      }

      public static int sumSquare(int number) {
            int sum = 0;
            int currentDigit;
            while(number > 0) {
                  currentDigit = number % 10;
                  sum += currentDigit * currentDigit;
                  number /= 10;
            }

            return sum;
      }

      public static int process(int num) {
            int currentNum = sumSquare(num);
            while(currentNum != 4 && currentNum != 1) {
                  currentNum = sumSquare(currentNum);
            }

            return currentNum;
      }


      public static String status(int num) {
            if(isHappy(num)) {
                  return "HAPPY";
            }
            
            return "SAD";
      }
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();
            
            a = process(a);
            System.out.println(status(a));

            scan.close();
      }      
}

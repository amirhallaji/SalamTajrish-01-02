import java.util.Scanner;

public class Q3 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int newNumber = 0;
            boolean hasEven = false;
            while (n > 0) {
                  int currentDigit = n % 10;
                  if (currentDigit % 2 == 0) {
                        hasEven = true;
                        newNumber = newNumber * 10 + currentDigit;
                  }

                  n /= 10;
            }

            int answer = 0;
            while (newNumber > 0) {
                  answer = answer * 10 + newNumber % 10;
                  newNumber /= 10;
            }

            if (answer != 0) {
                  System.out.println(answer);
            } else {
                  if (!hasEven) {
                        System.out.println("All digits were deleted");
                  }
            }

            scan.close();
      }
}

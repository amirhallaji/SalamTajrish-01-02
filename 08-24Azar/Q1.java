import java.util.*;

public class Q1 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int max = n % 10;
            while(n > 0) {
                  n /= 10;
                  if (n % 10 > max) {
                        max = n % 10;
                  }
            }
            
            switch (max) {
                  case 0 -> System.out.println("ZERO");
                  case 1 -> System.out.println("ONE");
                  case 2 -> System.out.println("TWO");
                  case 3 -> System.out.println("THREE");
                  case 4 -> System.out.println("FOUR");
                  case 5 -> System.out.println("FIVE");
                  case 6 -> System.out.println("SIX");
                  case 7 -> System.out.println("SEVEN");
                  case 8 -> System.out.println("EIGHT");
                  case 9 -> System.out.println("NINE");
            }

            scan.close();
      }
}
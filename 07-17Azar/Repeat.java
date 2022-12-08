import java.util.*;

public class Repeat {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int num = scan.nextInt();
            int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
            int c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
            while (num > 0) {
                  int currentDigit = num % 10;
                  switch(currentDigit) {
                        case 0 -> c0++;
                        case 1 -> c1++;
                        case 2 -> c2++;
                        case 3 -> c3++;
                        case 4 -> c4++;
                        case 5 -> c5++;
                        case 6 -> c6++;
                        case 7 -> c7++;
                        case 8 -> c8++;
                        case 9 -> c9++;
                  }

                  num /= 10;
            }

            System.out.println("zero: " + c0);
            System.out.println("one: " + c1);
            System.out.println("two: " + c2);
            System.out.println("three: " + c3);
            System.out.println("four: " + c4);
            System.out.println("five: " + c5);
            System.out.println("six: " + c6);
            System.out.println("seven: " + c7);
            System.out.println("eigth: " + c8);
            System.out.println("nine: " + c9);

            scan.close();
      }
}
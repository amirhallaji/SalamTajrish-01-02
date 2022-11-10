import java.util.Scanner;

public class First {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();
            double b = scan.nextDouble();

            double c = a + b;
            System.out.println("c is: " + c);

            scan.close();
      }
}
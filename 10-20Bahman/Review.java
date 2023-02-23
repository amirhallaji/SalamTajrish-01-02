import java.util.Scanner;

public class Review {
      public static double areaCalc(double radius) {
            return radius * radius * Math.PI;
      }

      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);            

            double radius = scan.nextDouble();

            System.out.println(areaCalc(radius));

            scan.close();
      }
}
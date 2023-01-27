import java.util.Scanner;

public class Function {
      public static float myAbs(float x) {
            if (x >= 0) {
                  return x;
            }
            
            return -x;
      }
      
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            float x = scan.nextFloat();

            System.out.println("x before abs: " + x);
            x = myAbs(x);
            System.out.println("x after abs: " + x);

            System.out.println(Math.pow(2, 3));
            System.out.println(Math.log10(1000));

      }
}
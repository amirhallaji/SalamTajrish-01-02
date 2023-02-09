public class Triangle {
      public static boolean canBeTriangle(double a, double b, double c) {
            if (a + b > c && b + c > a && c + a > b) {
                  return true;
            }

            return false;
      }

      public static void main(String[] args) {
            System.out.println(canBeTriangle(2, 2, 3));     
      }
}
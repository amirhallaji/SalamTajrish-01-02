public class Combination {
      public static int factorial(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                  result *= i;
            }

            return result;
      }

      public static int combination(int n, int k) {
            return factorial(n) / (factorial(n-k) * (factorial(k)));
      }
      public static void main(String[] args) {
            System.out.println(combination(10, 3));
      }
}

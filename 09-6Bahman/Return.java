public class Return {
      public static String numberScope(int x) {
            if (x < 0) {
                  return "less than zero";
            } else if (x == 0) {
                  return "zero";
            }

            return "greater than zero";
      }

      public static void main(String[] args) {
            System.out.println(numberScope(10));
      }
}

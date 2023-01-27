public class Sum {
      public static int mySum(int x) {
            int sum = 0;
            for(int i = 0; i < x; i++) {
                  sum += i;
            }

            return sum;
      }
      public static void main(String[] args) {
            System.out.println(mySum(10));     
      }
}

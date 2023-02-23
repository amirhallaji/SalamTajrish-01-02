public class PrimeCount {
      public static int finfPrimeCount(int a, int b) {
            boolean isPrime = true;
            int count = 0;

            for(int i = a + 1; i < b; i++) {
                  isPrime = true;

                  for(int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                              isPrime = false;

                              break;
                        }
                  }
                  
                  if (isPrime && i != 1) {
                        count++;
                  }
            }

            return count;
      }
      
      public static void main(String[] args) {
            System.out.println(finfPrimeCount(0, 20));
      }
}

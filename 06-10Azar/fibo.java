public class fibo {
      public static void main(String[] args) {
            for(int a = 0, b = 0, c = 1; c < 100; a = b, b = c, c = a + b) {
                  System.out.println(c);
            }
      }      
}

public class NumberPrinter {
      public static void printNumbers(int x1, int x2) {
            for(int i = x1+1; i < x2; i++){
                  System.out.print(i + ", ");
            }
            System.out.println();
      }

      public static void printNumbers2(int x1, int x2){
            for(int i = x1 + 1; i < x2; i++) {
                  if(i % 5 == 0) {
                        return;
                  }
                  System.out.print(i + ", ");
            }
            System.out.println();
      }
      public static void main(String[] args) {
            printNumbers(1, 10);
            printNumbers2(1, 10);
      }
}

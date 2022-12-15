import java.util.Scanner;

public class Q6 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            
            if (n % 2 == 0){
                  for(int i = 0; i < n; i++) {
                        for(int j = 0; j < n-i; j++) {
                              System.out.print("*");
                        }
                        for(int j = 0; j < 2*i; j++) {
                              System.out.print(" ");
                        }
                        for(int j = 0; j < n-i; j++) {
                              System.out.print("*");
                        }
                        System.out.println();
                  }
                  for(int i = n/2; i >= 0; i--) {
                        for(int j = 0; j < n-i; j++) {
                              System.out.print("*");
                        }
                        for(int j = 0; j < 2*i; j++) {
                              System.out.print(" ");
                        }
                        for(int j = 0; j < n-i; j++) {
                              System.out.print("*");
                        }
                        System.out.println();
                  }

            }else {
                  for(int i = 0; i < n; i++) {
                        for(int j = 0; j < n-i; j++) {
                              System.out.print("*");
                        }
                        for(int j = 0; j < 2*i; j++) {
                              System.out.print(" ");
                        }
                        for(int j = 0; j < n-i; j++) {
                              System.out.print("*");
                        }
                        System.out.println();
                  }
                  for(int i = n/2+2; i >= 0; i--) {
                        for(int j = 0; j < n-i; j++) {
                              System.out.print("*");
                        }
                        for(int j = 0; j < 2*i; j++) {
                              System.out.print(" ");
                        }
                        for(int j = 0; j < n-i; j++) {
                              System.out.print("*");
                        }
                        System.out.println();
                  }
            }

            scan.close();
      }
}

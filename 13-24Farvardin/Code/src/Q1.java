import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = new int[20];

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }

        double ave = (double) sum / numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            if (ave == numbers[i]) {
                System.out.println("true");

                return;
            }
        }

        System.out.println("false");

        scan.close();
    }
}

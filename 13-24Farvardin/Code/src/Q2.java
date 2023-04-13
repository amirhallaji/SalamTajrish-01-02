import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j <= numbers.length - 1; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }

        int counter = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                counter++;

                continue;
            }

            System.out.println(numbers[i] + ": " + counter);
            counter = 1;
        }

        System.out.println(numbers[numbers.length-1] + ": " + counter);
    }
}

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] salaries = new int[n];

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = scan.nextInt();
        }

        int maxSalary = Math.max(salaries[0], 0);
        int sum = maxSalary;
        for (int i = 1; i < salaries.length; i++) {
            sum += salaries[i];
            if (sum < 0) {
                sum = 0;
            } else {
                if (sum > maxSalary) {
                    maxSalary = sum;
                }
            }
        }

        System.out.println(maxSalary);
    }
}

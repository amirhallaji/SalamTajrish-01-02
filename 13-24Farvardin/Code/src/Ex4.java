import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String st1 = new String("salam");
        String st2 = "salam";

        System.out.println(st1.equals(st2));
        System.out.println(st1 == st2);
    }
}

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ex = scan.nextLine();

        System.out.println(ex.equals("ex"));
        System.out.println(ex.equalsIgnoreCase("ex"));

        System.out.println(ex.contains("fi"));

        System.out.println(ex.substring(3));
        System.out.println(ex.substring(3, 5));
    }
}

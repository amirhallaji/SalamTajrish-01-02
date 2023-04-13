import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ex = scan.next();

        ex = ex.concat(" khubi?");
        System.out.println(ex);

        System.out.println(ex.startsWith("gi"));
        System.out.println(ex.endsWith("bi?"));

        System.out.println(ex.length());

    }
}

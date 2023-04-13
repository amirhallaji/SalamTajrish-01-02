import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String example = scan.nextLine();

        System.out.println(example);
        example = example.replace("hi", "hello");
        System.out.println(example);

        System.out.println(example.indexOf("how"));
        System.out.println(example.lastIndexOf("o"));

    }
}

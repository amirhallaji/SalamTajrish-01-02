import java.util.*;;

public class Switch {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int x = scan.nextInt();

            switch (x) {
                  case 1:
                        System.out.println("SAT");
                        break;
                  case 2:
                        System.out.println("SUN");
                        break;
                  case 3:
                        System.out.println("MON");
                        break;
                  case 4:
                        System.out.println("TUE");
                        break;
                  case 5:
                        System.out.println("WED");
                        break;
                  case 6:
                        System.out.println("THU");
                        break;
                  case 7:
                        System.out.println("FRI");
                        break;
                  default:
                        System.out.println("Not Supported");
            }
            // New Switch case
            switch (x) {
                  case 1 -> System.out.println("SAT");
                  case 2 -> System.out.println("SUN");
                  case 3 -> System.out.println("MON");
                  case 4 -> System.out.println("TUE");
                  case 5 -> System.out.println("WED");
                  case 6 -> System.out.println("THU");
                  case 7 -> System.out.println("FRI");
                  default -> System.out.println("NOT SUPPORTED");
            }
      }
}

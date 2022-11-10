
public class test {
      public static void main(String[] args) {
            int a = 98, b = 18;
            String d = "salam";
            double e = 1.9;
            System.out.println((char)a);            

            System.out.println("------------");

            System.out.println("a is: " + a);
            System.out.print("a is: " + a);

            System.out.printf("a is %d\nb is: %d\nd is: %s\ne is: %f\n", a, b, d, e);
            
            System.out.println("a is: " + a);
            a++;
            ++a;
            System.out.println("a is: " + a);


            System.out.println("--------------------");
            a = (a++ + 2) * a;
            // 102 * 101 True
            // 103 * 101 False
            System.out.println(a);

            a = 100;
            a = (++a + 2) * a;
            // 103 * 101 True
            // 102 * 101 False
            System.out.println(a);

            a = 10;
            b = a++ + ++a;
            System.out.println(b + "\n" + a);
      }
}

/*
int -> %d
double -> %f
string -> %s
char -> %c
*/

import java.util.*;

public class q4 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            double weight, height;
            weight = scan.nextDouble();
            height = scan.nextDouble();

            double bmi = weight / (height * height);

            System.out.printf("%.2f\n", bmi);
            if (bmi < 18.5) {
                  System.out.println("UnderWeight");
            }
            else if(bmi >= 18.5 && bmi < 25){
                  System.out.println("Normal");
            }
            else if(bmi >= 25 && bmi < 30){
                  System.out.println("OverWeight");
            }
            else{
                  System.out.println("Obese");
            }

            scan.close();
      }
}

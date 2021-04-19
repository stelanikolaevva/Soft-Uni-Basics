package FirstTry.src;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double m2=Double.parseDouble(scanner.nextLine());
        double finalPrice=m2*7.61;
        double discount=m2*7.61*0.18;

        System.out.printf("The final price is: %f lv.\nThe discount is: %f lv.",finalPrice-discount,discount);

    }
}

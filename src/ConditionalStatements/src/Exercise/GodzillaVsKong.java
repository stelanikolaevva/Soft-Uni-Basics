package ConditionalStatements.src.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int extras=Integer.parseInt(scanner.nextLine());
        double clothesPrice=Double.parseDouble(scanner.nextLine());

        double decor=budget/10;
        double clothesTotal=extras*clothesPrice;
        if(extras>150) clothesTotal=clothesTotal*9/10;

        if((clothesTotal+decor)>budget)
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",(clothesTotal+decor)-budget);
        }
        else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-(clothesTotal+decor));
        }


    }
}

package Exersice;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyNow = Double.parseDouble(scanner.nextLine());

        int daysPassed = 0;
        int daysSpend = 0;

        while (moneyNeeded > moneyNow) {
            String saveOrSpend = scanner.nextLine();
            double moneySaveOrSpend = Double.parseDouble(scanner.nextLine());
            daysPassed++;

            if (saveOrSpend.equals("spend")) {
                moneyNow -= moneySaveOrSpend;
                if (moneyNow < 0) {
                    moneyNow = 0;
                }

                daysSpend++;
                if (daysSpend == 5) {
                    break;
                }

            } else {
                moneyNow += moneySaveOrSpend;
                daysSpend = 0;
            }
        }
        String output="";

        if(moneyNow>=moneyNeeded){
            output=String.format("You saved the money for %d days.",daysPassed);
        }
        else {
            output=String.format("You can't save the money.%n%d",daysPassed);
        }
        System.out.println(output);
    }
}

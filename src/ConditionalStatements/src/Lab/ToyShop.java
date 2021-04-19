package ConditionalStatements.src.Lab;

import java.util.Scanner;

//extra work
//test alike
public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double journeyPrice = Double.parseDouble(scanner.nextLine());
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        int totalOrdered = numberPuzzles + numberDolls + numberBears + numberMinions + numberTrucks;

        double totalEarned = numberPuzzles * 2.6 + numberDolls * 3 + numberBears * 4.1 + numberMinions * 8.2 + numberTrucks * 2;

        boolean isBiggerThan50=totalOrdered >= 50;
        if (isBiggerThan50) {
            totalEarned = totalEarned * 3 / 4;
        }
        totalEarned = totalEarned * 9 / 10;

        String output;
        boolean isMoneyEnough=totalEarned >= journeyPrice;
        if (isMoneyEnough) {
            output=String.format("Yes! %.2f lv left.", totalEarned-journeyPrice );
        } else {
            output=String.format("Not enough money! %.2f lv needed.",journeyPrice - totalEarned);
        }
        System.out.println(output);
    }
}

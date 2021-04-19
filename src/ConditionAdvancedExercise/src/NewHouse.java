package ConditionAdvancedExercise.src;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = 0;

        if ("Roses".equals(flowerType)) {
            total = flowerCount * 5.00;

            if (flowerCount > 80) {
                total = total * 0.90;
            }
        } else if ("Dahlias".equals(flowerType)) {
            total = flowerCount * 3.80;

            if (flowerCount > 90) {
                total = total * 0.85;
            }
        } else if ("Tulips".equals(flowerType)) {
            total = flowerCount * 2.80;

            if (flowerCount > 80) {
                total = total * 0.85;
            }
        } else if ("Narcissus".equals(flowerType)) {
            total = flowerCount * 3.00;

            if (flowerCount < 120) {
                total = total * 1.15;
            }
        } else if ("Gladiolus".equals(flowerType)) {
            total = flowerCount * 2.50;
            if (flowerCount < 80) {
                total = total * 1.20;
            }
        }

        if (budget >= total){
            System.out.printf("Hey, you have a great garden with " + flowerCount + " " + flowerType + " and %.2f leva left.", budget - total);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",total - budget);
        }
    }
}

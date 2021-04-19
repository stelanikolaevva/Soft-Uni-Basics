package ConditionsAdvancedLab.src;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double bill = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if ("banana".equals(fruit)) {
                    bill = quantity * 2.5;
                    System.out.printf("%.2f", bill);
                } else if ("apple".equals(fruit)) {
                    bill = quantity * 1.2;
                    System.out.printf("%.2f", bill);
                } else if ("orange".equals(fruit)) {
                    bill = quantity * 0.85;
                    System.out.printf("%.2f", bill);
                } else if ("grapefruit".equals(fruit)) {
                    bill = quantity * 1.45;
                    System.out.printf("%.2f", bill);
                } else if ("kiwi".equals(fruit)) {
                    bill = quantity * 2.7;
                    System.out.printf("%.2f", bill);
                } else if ("pineapple".equals(fruit)) {
                    bill = quantity * 5.5;
                    System.out.printf("%.2f", bill);
                } else if ("grapes".equals(fruit)) {
                    bill = quantity * 3.85;
                    System.out.printf("%.2f", bill);
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if ("banana".equals(fruit)) {
                    bill = quantity * 2.7;
                    System.out.printf("%.2f", bill);
                } else if ("apple".equals(fruit)) {
                    bill = quantity * 1.25;
                    System.out.printf("%.2f", bill);
                } else if ("orange".equals(fruit)) {
                    bill = quantity * 0.90;
                    System.out.printf("%.2f", bill);
                } else if ("grapefruit".equals(fruit)) {
                    bill = quantity * 1.60;
                    System.out.printf("%.2f", bill);
                } else if ("kiwi".equals(fruit)) {
                    bill = quantity * 3;
                    System.out.printf("%.2f", bill);
                } else if ("pineapple".equals(fruit)) {
                    bill = quantity * 5.6;
                    System.out.printf("%.2f", bill);
                } else if ("grapes".equals(fruit)) {
                    bill = quantity * 4.2;
                    System.out.printf("%.2f", bill);
                } else {
                    System.out.println("error");

                }
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}

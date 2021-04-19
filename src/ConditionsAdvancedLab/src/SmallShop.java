package ConditionsAdvancedLab.src;

import java.util.Scanner;
public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double bill = 0;
        switch (city) {
            case "Sofia":
                if (product.equals("coffee")) {
                    bill = quantity * 0.5;
                } else if (product.equals("water")) {
                    bill = quantity * 0.8;
                } else if (product.equals("beer")) {
                    bill = quantity * 1.2;
                } else if (product.equals("sweets")) {
                    bill = quantity * 1.45;
                } else if (product.equals("peanuts")) {
                    bill = quantity * 1.6;
                } break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    bill = quantity * 0.4;
                } else if (product.equals("water")) {
                    bill = quantity * 0.7;
                } else if (product.equals("beer")) {
                    bill = quantity * 1.15;
                } else if (product.equals("sweets")) {
                    bill = quantity * 1.30;
                } else if (product.equals("peanuts")) {
                    bill = quantity * 1.5;
                } break;
            case "Varna":
                if (product.equals("coffee")) {
                    bill = quantity * 0.45;
                } else if (product.equals("water")) {
                    bill = quantity * 0.7;
                } else if (product.equals("beer")) {
                    bill = quantity * 1.10;
                } else if (product.equals("sweets")) {
                    bill = quantity * 1.35;
                } else if (product.equals("peanuts")) {
                    bill = quantity * 1.55;
                }break;
        }
        System.out.println(bill);
    }
}

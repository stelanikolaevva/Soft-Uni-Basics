package ConditionAdvancedExercise.src;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String partsOfDay = scanner.nextLine();
        String shoes = "", outfit = "";

        switch (partsOfDay) {
            case "Morning":
                if (degree >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degree > 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree >= 10) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }
                break;
            case "Afternoon":
                if (degree >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                } else if (degree > 18) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degree >= 10) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
            case "Evening":
                if (degree >= 10) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
            default:
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
    }
}

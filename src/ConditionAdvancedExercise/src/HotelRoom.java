package ConditionAdvancedExercise.src;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartment = 0.0, studio = 0.0;

        if ("May".equals(month) || "October".equals(month)) {
            studio = nights * 50;
            apartment = nights * 65;
            if (nights > 14) {
                studio *= 0.7;
            } else if (nights > 7) {
                studio *= 0.95;
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            studio = nights * 75.2;
            apartment = nights * 68.7;
            if (nights > 14) {
                studio *= 0.8;
            }
        } else if ("July".equals(month) || "August".equals(month)) {
            studio = nights * 76;
            apartment = nights * 77;
        }
        if(nights>14){
            apartment*=0.9;
        }

        System.out.printf("Apartment: %.2f lv.",apartment);
        System.out.printf("\nStudio: %.2f lv.",studio);

    }
}

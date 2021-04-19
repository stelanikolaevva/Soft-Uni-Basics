package ConditionAdvancedExercise.src;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingHour = Integer.parseInt(scanner.nextLine());
        int startingMinutes = Integer.parseInt(scanner.nextLine());

        int arrivingHour = Integer.parseInt(scanner.nextLine());
        int arrivingMinutes = Integer.parseInt(scanner.nextLine());

        int start = startingHour * 60 + startingMinutes;
        int arrive = arrivingHour * 60 + arrivingMinutes;

        int difference = start - arrive;

        if (difference < 0) {
            System.out.println("Late");
        } else if (difference <= 30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (difference > 0) {
            if (difference < 60) {
                System.out.printf("%d minutes before the start", difference);
            } else {
                if (difference % 60 < 10) {
                    System.out.printf("%d:0%d hours before the start", difference / 60, difference % 60);
                } else {
                    System.out.printf("%d:%d hours before the start", difference / 60, difference % 60);
                }
            }
        } else if (difference < 0) {
            difference = Math.abs(difference);
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {

                if (difference % 60 < 10) {
                    System.out.printf("%d:0%d hours after the start", difference / 60, difference % 60);
                } else {
                    System.out.printf("%d:%d hours after the start", difference / 60, difference % 60);
                }

            }
        }
    }
}

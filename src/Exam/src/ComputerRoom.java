package Exam.src;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int timeOfStay = Integer.parseInt(scanner.nextLine());
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double pricePerPerson = 0.0;

        switch (month) {
            case "march":
            case "april":
            case "may":
                if ("day".equals(dayOrNight)) {
                    pricePerPerson = 10.50;
                } else {
                    pricePerPerson = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if ("day".equals(dayOrNight)) {
                    pricePerPerson = 12.60;
                } else {
                    pricePerPerson = 10.20;
                }
                break;
            default:
                break;
        }
        if (timeOfStay >= 5) {
            pricePerPerson *= 0.50;
        }
        if (numberOfPeople >= 4) {
            pricePerPerson *= 0.90;
        }
        double totalSum = pricePerPerson * numberOfPeople * timeOfStay;
        System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
        System.out.printf("Total cost of the visit: %.2f", totalSum);
    }
}

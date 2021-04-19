package Exam.src;

import java.util.Scanner;

public class AndProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedProcessors = Integer.parseInt(scanner.nextLine());
        int numberEmployees = Integer.parseInt(scanner.nextLine());
        int daysWorking = Integer.parseInt(scanner.nextLine());

        int totalWorkingHours = numberEmployees * daysWorking * 8;
        double madeProcessors = Math.floor(1.0 * totalWorkingHours / 3);

        double difference = wantedProcessors - madeProcessors;
        if (difference <= 0) {
            System.out.printf("Profit: -> %.2f BGN", Math.abs(difference) * 110.10);
        } else {
            System.out.printf("Losses: -> %.2f BGN", difference * 110.10);
        }
    }
}

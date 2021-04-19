package Exam.src;

import java.util.Scanner;

public class PassengersPerFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberAirlines = Integer.parseInt(scanner.nextLine());
        ;

        double maxPassengers = Integer.MIN_VALUE;
        String mostUsedAirline = "";

        for (int i = 0; i < numberAirlines; i++) {
            String nameAirline = scanner.nextLine();
            int passengersOnAllFlights = 0;
            int flightsCount = 0;

            String line = scanner.nextLine();
            while (!line.equals("Finish")) {
                int passengersOnThisFlight = Integer.parseInt(line);

                passengersOnAllFlights += passengersOnThisFlight;
                flightsCount++;

                line = scanner.nextLine();
            }
            double averagePeople = Math.floor(1.0 * passengersOnAllFlights / flightsCount);
            System.out.printf("%s: %.0f passengers.%n", nameAirline, averagePeople);

            if (averagePeople > maxPassengers) {
                maxPassengers = averagePeople;
                mostUsedAirline = nameAirline;
            }
        }
        System.out.printf("%s has most passengers per flight: %.0f", mostUsedAirline, maxPassengers);
    }
}

package ConditionAdvancedExercise.src;//extra work
//not included in final score

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine()); // pchivni dni
        int weekends = Integer.parseInt(scanner.nextLine()); //kum rodniq grad toest igrae i nedelq

        double daysPlaying = 1.0 * (48 - weekends) * 3 / 4;
        daysPlaying += weekends;
        daysPlaying += 1.0 * holidays * 2 / 3;
        if ("leap".equals(year)) {
            daysPlaying *= 1.15;
        }
        daysPlaying = Math.floor(daysPlaying);
        System.out.printf("%.0f", daysPlaying);
        
    }
}

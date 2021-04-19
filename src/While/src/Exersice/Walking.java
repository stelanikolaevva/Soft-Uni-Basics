package Exersice;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int totalSteps = 10000;

        while (totalSteps >= 0) {
            String line = scanner.nextLine();
            if (line.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps -= steps;
                break;
            }
            int steps = Integer.parseInt(line);
            totalSteps -= steps;
        }
        if (totalSteps <= 0) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(totalSteps));
        } else {
            System.out.printf("%d more steps to reach goal.", totalSteps);
        }
    }
}

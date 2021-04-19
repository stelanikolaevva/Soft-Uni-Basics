package Exersice;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProblems = Integer.parseInt(scanner.nextLine());

        String lastProblem = "";
        int failedCount = 0;
        int solvedCount = 0;
        double avgGrade = 0;
        boolean isFailed = true;

        while (failedCount < numberOfProblems) {
            String problem = scanner.nextLine();
            if (problem.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                failedCount++;
            }
            avgGrade += grade;
            solvedCount++;
            lastProblem = problem;

        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", numberOfProblems);
        } else {
            System.out.printf("Average score: %.2f%n",avgGrade / solvedCount);
            System.out.println("Number of problems: " + solvedCount);
            System.out.println("Last problem: " + lastProblem);
        }
    }
}

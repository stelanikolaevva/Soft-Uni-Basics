package ConditionAdvancedExercise.src;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        String operator = scanner.nextLine();
        if (operator.equals("+")) {
            System.out.printf("%d + %d = %d - ", n1, n2, n1 + n2);
            if ((n1 + n2) % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else if (operator.equals("-")) {
            System.out.printf("%d - %d = %d - ", n1, n2, n1 - n2);
            if ((n1 - n2) % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else if (operator.equals("*")) {
            System.out.printf("%d * %d = %d - ", n1, n2, n1 * n2);
            if ((n1 * n2) % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double del=n1*1.0/n2;
                System.out.printf("%d / %d = %.2f", n1, n2, del);
            }
        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {System.out.printf("%d %% %d = %d", n1, n2, n1 % n2);
            }
        }

    }
}

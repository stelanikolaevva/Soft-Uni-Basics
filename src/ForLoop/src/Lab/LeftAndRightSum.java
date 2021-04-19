package Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < n; i++) {
            int left = Integer.parseInt(scanner.nextLine());
            sumLeft += left;
        }
        for (int i = 0; i < n; i++) {
            int right = Integer.parseInt(scanner.nextLine());
            sumRight += right;
        }

        if (sumLeft == sumRight) {
            System.out.println("Yes, sum = " + sumLeft);
        } else {
            System.out.println("No, diff = " + Math.abs(sumLeft - sumRight));
        }

    }
}

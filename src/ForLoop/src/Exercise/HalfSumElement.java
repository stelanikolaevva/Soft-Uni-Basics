package Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        sum -= maxNumber;
        if (sum == maxNumber) {
            System.out.println("Yes\nSum = " + maxNumber);
        } else {
            System.out.println("No\nDiff = " + Math.abs(sum - maxNumber));
        }
    }
}

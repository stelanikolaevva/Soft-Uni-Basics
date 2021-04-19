package Exercise;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                d1++;
            }
            if (number % 3 == 0) {
                d2++;
            }
            if (number % 4 == 0) {
                d3++;
            }
        }
        System.out.printf("%.2f%%%n",1.0*d1/n*100);
        System.out.printf("%.2f%%%n",1.0*d2/n*100);
        System.out.printf("%.2f%%%n",1.0*d3/n*100);
    }
}

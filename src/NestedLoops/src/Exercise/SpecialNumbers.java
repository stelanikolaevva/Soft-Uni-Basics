package Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            boolean isSpecial = true;
            int num = i;

            while (num != 0) {
                int digit = num % 10;
                if (digit != 0) {
                    if (N % digit != 0) {
                        isSpecial = false;
                        break;
                    }
                }
                else{
                    isSpecial = false;
                    break;
                }
                num /= 10;
            }
            if (isSpecial) {
                System.out.print(i + " ");
            }
        }
    }
}
// 100/100
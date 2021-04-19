package Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String currentNum = "" + i;
            int sumEven = 0;
            int sumOdd = 0;
            for (int sym = 0; sym < currentNum.length(); sym++) {
                int currentDigit = Integer.parseInt(""+currentNum.charAt(sym));
                if (sym % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
            }
            if(sumEven==sumOdd){
                System.out.print(i+" ");
            }
        }
    }
}

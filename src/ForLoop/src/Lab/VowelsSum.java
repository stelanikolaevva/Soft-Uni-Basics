package Lab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a':
                    sum++;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}

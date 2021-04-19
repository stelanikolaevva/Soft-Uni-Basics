package Exersice;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalPieces = width * height;

        String line = "";

        while (totalPieces > 0) {
            line = scanner.nextLine();
            if (line.equals("STOP")) {
                System.out.printf("%d pieces are left.", totalPieces);
                break;
            } else {
                int taken = Integer.parseInt(line);
                totalPieces -= taken;
                if (totalPieces <= 0) {
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
                }
            }
        }

    }
}

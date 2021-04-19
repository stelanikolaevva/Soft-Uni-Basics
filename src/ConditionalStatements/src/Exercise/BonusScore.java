package ConditionalStatements.src.Exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if (startNumber <= 100) {
            bonusPoints = 5;
        } else if (startNumber <= 1000) {
            bonusPoints = 1.0*startNumber / 5;
        } else {
            bonusPoints=1.0*startNumber/10;
        }

        if(startNumber%2==0) {
            bonusPoints++;
        }
        else if(startNumber%10==5)
        {
            bonusPoints+=2;
        }
        System.out.println(bonusPoints+"\n"+(bonusPoints+startNumber));
    }
}

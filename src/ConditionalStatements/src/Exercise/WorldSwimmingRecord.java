package ConditionalStatements.src.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double recordTime=Double.parseDouble(scanner.nextLine());
        double recordMetres=Double.parseDouble(scanner.nextLine());
        double secondFor1Metre=Double.parseDouble(scanner.nextLine());

        double timesSlowed=Math.floor(recordMetres/15);
        double totalTime=recordMetres*secondFor1Metre+timesSlowed*12.5;

        if(totalTime<recordTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime-recordTime);
        }
    }
}

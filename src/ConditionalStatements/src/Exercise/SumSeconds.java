package ConditionalStatements.src.Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int third=Integer.parseInt(scanner.nextLine());

        int totalTime=first+second+third;
        int totalMin=totalTime/60;
        int totalSec=totalTime%60;

        if(totalSec<10) {
            System.out.printf("%d:0%d",totalMin,totalSec);
        }
        else
        {
            System.out.printf("%d:%d",totalMin,totalSec);
        }
        // System.out.printf("%d:%02d",totalMin,totalSec);
    }
}

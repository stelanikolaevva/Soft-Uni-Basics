package ConditionAdvancedExercise.src;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String ticket=scanner.nextLine();
        int rows=Integer.parseInt(scanner.nextLine());
        int columns=Integer.parseInt(scanner.nextLine());
        double total=0.0;
        if("Premiere".equals(ticket)){
            total=12*rows*columns;
        }
        else if("Normal".equals(ticket)){
            total=7.5*rows*columns;
        }
        else if("Discount".equals(ticket)){
            total=5*rows*columns;
        }
        System.out.printf("%.2f",total);

    }
}

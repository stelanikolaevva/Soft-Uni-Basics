package ConditionAdvancedExercise.src;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();

        String output="";
        if(budget<=100){
            if("summer".equals(season)){
                 output=String.format("Somewhere in Bulgaria\nCamp - %.2f",budget*0.3);
            }
            else if("winter".equals(season)){
                output=String.format("Somewhere in Bulgaria\nHotel - %.2f",budget*0.7);
            }
        }
        else if(budget<=1000){
            if("summer".equals(season)){
                output=String.format("Somewhere in Balkans\nCamp - %.2f",budget*0.4);
            }
            else if("winter".equals(season)){
                output=String.format("Somewhere in Balkans\nHotel - %.2f",budget*0.8);
            }
        }
        else {
            output=String.format("Somewhere in Europe\nHotel - %.2f",budget*0.9);

        }
        System.out.println(output);
    }

}

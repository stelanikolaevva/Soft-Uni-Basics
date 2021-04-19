package Exam.src;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int boughtFoodKg=Integer.parseInt(scanner.nextLine());
        int allFoodGr=boughtFoodKg*1000;

        String line= scanner.nextLine();
        while(!line.equals("Adopted")){
            int dailyFood=Integer.parseInt(line);
            allFoodGr-=dailyFood;

            line= scanner.nextLine();
        }
        if(allFoodGr>=0){
            System.out.printf("Food is enough! Leftovers: %d grams.",allFoodGr);
        }
        else{
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs((allFoodGr)));
        }
    }
}

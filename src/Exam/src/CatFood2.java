package Exam.src;

import java.util.Scanner;

public class CatFood2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numCats = Integer.parseInt(scanner.nextLine());

        int groupSmall = 0;   //100-199
        int groupBig = 0;     //200-299
        int groupHuge = 0;    //300-399
        double allConsumedFood = 0.0;

        for (int i = 0; i < numCats; i++) {
            double consumedFood = Double.parseDouble(scanner.nextLine());
            if (consumedFood>=100 && consumedFood < 200) {
                groupSmall++;
            } else if (consumedFood < 300) {
                groupBig++;
            } else  {
                groupHuge++;
            }
            allConsumedFood += consumedFood;
        }
        double priceKG=12.45;
        double priceForFood = (allConsumedFood/1000) * priceKG;


        System.out.printf("Group 1: %d cats.%n", groupSmall);
        System.out.printf("Group 2: %d cats.%n", groupBig);
        System.out.printf("Group 3: %d cats.%n", groupHuge);
        System.out.printf("Price for food per day: %.2f lv.", priceForFood);

    }
}

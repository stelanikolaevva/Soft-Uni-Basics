package Exam.src;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine());//number of cats

        int group1 = 0; //100-199
        int group2 = 0; //200-299
        int group3 = 0; //300-399
        double totalFoodAte = 0.0;

        for (int i = 0; i < cats; i++) {
            double foodAte = Double.parseDouble(scanner.nextLine());
            if (foodAte>=100 && foodAte < 200) {
                group1++;
            } else if (foodAte < 300) {
                group2++;
            } else  {
                group3++;
            }
            totalFoodAte += foodAte;
        }
        System.out.printf("Group 1: %d cats.%n", group1);
        System.out.printf("Group 2: %d cats.%n", group2);
        System.out.printf("Group 3: %d cats.%n", group3);

        double priceForGram = 12.45 / 1000; //12.45 price pre kg
        double priceForFood = totalFoodAte * priceForGram;
        System.out.printf("Price for food per day: %.2f lv.", priceForFood);
    }
}

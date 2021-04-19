package Lab;
//extra work
//not included in final score
import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        double moneyGift = 10.00;
        double totalMoney = 0.0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                totalMoney += moneyGift;
                moneyGift += 10.00;
                totalMoney--;
            } else {
                toyCount++;
            }
        }
        totalMoney += toyCount * priceToy;
        if (totalMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", totalMoney - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - totalMoney);
        }
    }
}

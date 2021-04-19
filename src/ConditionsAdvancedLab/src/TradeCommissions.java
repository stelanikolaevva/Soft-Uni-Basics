package ConditionsAdvancedLab.src;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double volumeSales = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        if (0 <= volumeSales && volumeSales <= 500) {
            if (city.equals("Sofia")) {
                commission = volumeSales * 5 / 100;
            } else if (city.equals("Varna")) {
                commission = volumeSales * 4.5 / 100;
            } else if (city.equals("Plovdiv")) {
                commission = volumeSales * 5.5 / 100;
            }

        } else if (500 < volumeSales && volumeSales <= 1000) {
            if (city.equals("Sofia")) {
                commission = volumeSales * 7 / 100;
            } else if (city.equals("Varna")) {
                commission = volumeSales * 7.5 / 100;
            } else if (city.equals("Plovdiv")) {
                commission = volumeSales * 8 / 100;
            }
        } else if (1000 < volumeSales && volumeSales <= 10000) {
            if (city.equals("Sofia")) {
                commission = volumeSales * 8 / 100;
            } else if (city.equals("Varna")) {
                commission = volumeSales * 10 / 100;
            } else if (city.equals("Plovdiv")) {
                commission = volumeSales * 12 / 100;
            }
        } else if (volumeSales > 10000) {
            if (city.equals("Sofia")) {
                commission = volumeSales * 12 / 100;
            } else if (city.equals("Varna")) {
                commission = volumeSales * 13 / 100;
            } else if (city.equals("Plovdiv")) {
                commission = volumeSales * 14.5 / 100;
            }
        }
        if ((!city.equals("Varna") && !city.equals("Plovdiv") && !city.equals("Sofia")) || volumeSales < 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);
        }
    }
}

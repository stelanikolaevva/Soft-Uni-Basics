package Exam.src;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double pricePerPage=Double.parseDouble(scanner.nextLine());
        double pricePerCover=Double.parseDouble(scanner.nextLine());
        int percentDiscount=Integer.parseInt(scanner.nextLine());
        double taxForDesigner=Double.parseDouble(scanner.nextLine());
        int percentCoveredByTeam=Integer.parseInt(scanner.nextLine());

        double sumForPrint=899*pricePerPage+2*pricePerCover;
        double discountedSum=sumForPrint*(100-percentDiscount)/100;

        double totalSum=discountedSum+taxForDesigner;
        totalSum=totalSum*(100-percentCoveredByTeam)/100;

        System.out.printf("Avtonom should pay %.2f BGN.",totalSum);


    }
}

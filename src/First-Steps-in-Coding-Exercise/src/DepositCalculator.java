import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());


        double sum = deposit + month * ((deposit * interestRate / 100) / 12);
        System.out.println(sum);
    }
}

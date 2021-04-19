import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        int cake = rent * 20 / 100;
        double beverages= cake*1.0*55/100;
        double animator=rent*1.0/3;

        double budget=rent+cake+beverages+animator;
        System.out.println(budget);
    }
}

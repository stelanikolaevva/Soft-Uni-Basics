package Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < tabs; i++) {
            String websites = scanner.nextLine();
            if ("Facebook".equals(websites)) {
                salary -= 150;
            } else if ("Instagram".equals(websites)) {
                salary -= 100;
            } else if ("Reddit".equals(websites)) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%.0f",salary);
        }
    }
}

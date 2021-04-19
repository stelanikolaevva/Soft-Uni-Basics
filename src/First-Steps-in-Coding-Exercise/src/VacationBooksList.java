import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages=Integer.parseInt(scanner.nextLine());
        int pagesHours=Integer.parseInt(scanner.nextLine());
        int daysLeft=Integer.parseInt(scanner.nextLine());

        int daysReading=bookPages/daysLeft/pagesHours;

        System.out.println(daysReading);
    }
}
//   100/100
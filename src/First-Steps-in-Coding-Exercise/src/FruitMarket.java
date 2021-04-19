import java.util.Scanner;

//extra work
//no points for final score
public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double strawberryPrice=Double.parseDouble(scanner.nextLine());
        double bananaKG=Double.parseDouble(scanner.nextLine());
        double orangeKG=Double.parseDouble(scanner.nextLine());
        double raspberryKG=Double.parseDouble(scanner.nextLine());
        double strawberryKG=Double.parseDouble(scanner.nextLine());

        double raspberryPrice=strawberryPrice/2;
        double orangePrice=raspberryPrice*60/100;
        double bananaPrice=raspberryPrice*20/100;

        double strawberryTotal=strawberryKG*strawberryPrice;
        double bananaTotal=bananaKG*bananaPrice;
        double orangeTotal=orangeKG*orangePrice;
        double raspberryTotal=raspberryKG*raspberryPrice;

        double sum=strawberryTotal+bananaTotal+orangeTotal+raspberryTotal;
        System.out.printf("%.2f",sum);
    }
}

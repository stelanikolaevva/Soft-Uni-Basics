import java.util.Scanner;

//extra work
//no points for final score
public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int daysRunning=Integer.parseInt(scanner.nextLine());
        int bakers=Integer.parseInt(scanner.nextLine());
        int cakes=Integer.parseInt(scanner.nextLine()); //торта-45лв
        int waffles=Integer.parseInt(scanner.nextLine()); //5.80
        int pancakes=Integer.parseInt(scanner.nextLine()); //3.20

        double bakedGoodsPricePerDay=bakers*cakes*45+bakers*waffles*5.8+bakers*pancakes*3.2;
        double sum=daysRunning*bakedGoodsPricePerDay;
        sum=sum*7/8;
         System.out.printf("%.2f", sum);
    }
}

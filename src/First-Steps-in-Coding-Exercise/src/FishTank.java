import java.util.Scanner;

//extra work
//no points for final score
public class FishTank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // вход в сантиментри
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        //процент зает с пясък,...
        double percent = Double.parseDouble(scanner.nextLine());

        //10 см = 1дм 1000см=1дм3
        double volume = length*width*height;
        volume/=1000;

        double water= volume*(100-percent)/100;
        System.out.printf("%.2f",water);

    }
}

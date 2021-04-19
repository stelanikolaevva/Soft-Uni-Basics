package FirstTry.src;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int dogs=Integer.parseInt(scan.nextLine());
        int other=Integer.parseInt(scan.nextLine());

        System.out.println(dogs*2.5+other*4+" lv");
    }
}

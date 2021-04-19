package FirstTry.src;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        String firstName=scr.nextLine();
        String lastName=scr.nextLine();
        int age=Integer.parseInt(scr.nextLine());
        String town=scr.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",firstName,lastName,age,town);

    }
}

package ConditionsAdvancedLab.src;

import java.util.Scanner;

//extra work
//not included in final score
public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stay = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rate = scanner.nextLine();

        double pay = 0;
        switch (room) {
            case "room for one person":
                pay = (stay - 1) * 18;
                break;
            case "apartment":
                pay = (stay - 1) * 25;
                if (stay < 10) {
                    pay = pay * 0.7;
                } else if (stay <= 15) {
                    pay = pay * 0.65;
                }else {
                    pay=pay*0.5;
                }
                break;
            case "president apartment":
                pay = (stay - 1) * 35;
                if (stay < 10) {
                    pay = pay * 0.9;
                } else if (stay <= 15) {
                    pay = pay * 0.85;
                }else {
                    pay=pay*0.8;
                }
                break;
        }
        if(rate.equals("positive")){
            pay=pay*1.25;
        }else{
            pay=pay*0.9;
        }
        System.out.printf("%.2f",pay);
    }
}

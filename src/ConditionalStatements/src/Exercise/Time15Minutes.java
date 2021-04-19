package ConditionalStatements.src.Exercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int hour=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());

        if(minutes>=45)
        {
            minutes=minutes-45;
            hour++;
            if(hour>=24)
            {
                hour-=24;
            }
        }
        else {
            minutes+=15;
        }
        System.out.printf("%d:%02d",hour,minutes);
    }
}

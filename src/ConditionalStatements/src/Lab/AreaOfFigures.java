package ConditionalStatements.src.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double area=0;
        String figure= scanner.nextLine();
        if(figure.equals("square"))        {
            double side=Double.parseDouble(scanner.nextLine());
            area=side*side;
        }
        else  if(figure.equals("rectangle")){
            double width=Double.parseDouble(scanner.nextLine());
            double height=Double.parseDouble(scanner.nextLine());
            area=width*height;
        }
        else  if(figure.equals("circle")){
            double radius=Double.parseDouble(scanner.nextLine());
            area=radius*radius*Math.PI;
        }
        else  if(figure.equals("triangle"))
        {
            double a=Double.parseDouble(scanner.nextLine());
            double h=Double.parseDouble(scanner.nextLine());
            area=1.0*a*h/2;
        }
        System.out.printf("%.3f",area);
    }
}

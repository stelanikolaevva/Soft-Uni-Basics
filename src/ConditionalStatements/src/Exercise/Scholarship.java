package ConditionalStatements.src.Exercise;

import java.util.Scanner;

//not included in final grade
public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double excellentScholarship = Math.floor(averageGrade * 25);
        double socialScholarship = Math.floor(minSalary * 35 / 100);

        boolean excIsMore = excellentScholarship >= socialScholarship;

        if (income > minSalary) {
            if (averageGrade >= 5.50) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        } else {
            if (averageGrade<4.50){
                System.out.println("You cannot get a scholarship!");
            }
            else if(averageGrade<5.5){
                System.out.printf("You get a Social scholarship %.0f BGN",socialScholarship);
            }
            else {
                if(excIsMore) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
                }
                else {
                    System.out.printf("You get a Social scholarship %.0f BGN",socialScholarship);
                }
            }
        }


    }
}

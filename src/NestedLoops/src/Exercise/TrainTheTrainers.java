package Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());

        double pptGrade=0.0; //ppt=presentation
        double studentAvg=0.0;
        double pptCount=0;

        String line = scanner.nextLine();
        while (!line.equals("Finish")) {
            for (int i = 0; i < judges; i++) {
                double grade=Double.parseDouble(scanner.nextLine());
                pptGrade+=grade;
            }
            System.out.printf("%s - %.2f.%n",line,pptGrade/judges);
            studentAvg+=pptGrade;
            pptCount++;
            pptGrade=0.0;
            line= scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",studentAvg/(pptCount*judges));
    }
}

package ConditionalStatements.src.Exercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputNumber = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();


        if (inputUnit.equals("mm")) {
            if (outputUnit.equals("cm")) {
                inputNumber /=10;
            } else if (outputUnit.equals("m")){
                inputNumber /=1000;
            }
        } else if (inputUnit.equals("cm")) {
            if (outputUnit.equals("mm")) {
                inputNumber *= 10;
            } else if (outputUnit.equals("m")) {
                inputNumber /= 100;
            }
        } else {
            if (outputUnit.equals("mm")) {
               inputNumber *= 1000;
            } else if (outputUnit.equals("cm")) {
                inputNumber *= 100;
            }
        }
        System.out.printf("%.3f",inputNumber);
    }
}

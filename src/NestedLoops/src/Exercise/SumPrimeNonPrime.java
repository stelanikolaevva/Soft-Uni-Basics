package Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!line.equals("stop")) {
            boolean isPrime=true;
            int number=Integer.parseInt(line);
            if(number<0){
                System.out.println("Number is negative.");
                line= scanner.nextLine();
                continue;
            }
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                sumPrime+=number;
            }
            else{
                sumNonPrime+=number;
            }
            line= scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: "+sumPrime);
        System.out.println("Sum of all non prime numbers is: "+sumNonPrime);
    }
}

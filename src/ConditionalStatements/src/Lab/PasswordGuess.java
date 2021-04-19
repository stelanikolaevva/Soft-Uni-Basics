package ConditionalStatements.src.Lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        String correctPassword="s3cr3t!P@ssw0rd";

        Scanner scanner=new Scanner(System.in);
        String guess=scanner.nextLine();

        if(guess.equals(correctPassword)){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}

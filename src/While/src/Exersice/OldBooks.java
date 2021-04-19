package Exersice;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String favBook= scanner.nextLine();

        String inputBook= scanner.nextLine();
        int count=0;
        while(!favBook.equals(inputBook) && !inputBook.equals("No More Books"))
        {
            count++;
            inputBook= scanner.nextLine();
        }
        if(inputBook.equals("No More Books")){
            System.out.printf("The book you search is not here!\nYou checked %d books.\n",count);
        }
        else {
            System.out.printf("You checked %d books and found it.",count);
        }

    }
}

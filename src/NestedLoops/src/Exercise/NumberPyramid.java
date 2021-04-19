package Exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int current=1;

        for(int rows=1;rows<=n;rows++){
            for(int colm=0;colm<rows;colm++){
                if(current>n){
                    break;
                }
                System.out.print(current+" ");
                current++;
            }
            System.out.println();
            if(current>n){
                break;
            }
        }
    }
}

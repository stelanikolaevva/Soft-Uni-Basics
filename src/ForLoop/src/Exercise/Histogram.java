package Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int d1=0;
        int d2=0;
        int d3=0;
        int d4=0;
        int d5=0;

        for(int i=0;i<n;i++)
        {
            int number=Integer.parseInt(scanner.nextLine());
            if(number<200) {
                d1++;
            }
            else if(number<400){
                d2++;
            }
            else if(number<600){
                d3++;
            }
            else if(number<800){
                d4++;
            }
            else {
                d5++;
            }
        }
        System.out.printf("%.2f%%%n",1.0*d1/n*100);
        System.out.printf("%.2f%%%n",1.0*d2/n*100);
        System.out.printf("%.2f%%%n",1.0*d3/n*100);
        System.out.printf("%.2f%%%n",1.0*d4/n*100);
        System.out.printf("%.2f%%%n",1.0*d5/n*100);
    }
}

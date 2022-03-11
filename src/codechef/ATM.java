package codechef;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] ab = a.split(" ");
        double c = Double.parseDouble(ab[0]);
        double d = Double.parseDouble(ab[1]);
        if(c%5!=0){
            System.out.printf("%.2f",d);
        }
        else if(c+0.50>d){
            System.out.printf("%.2f",d);
        }
        else{
            System.out.printf("%.2f",d-c-0.50);
        }
    }

}

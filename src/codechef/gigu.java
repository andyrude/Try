package codechef;

import java.util.Scanner;

public class gigu {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        long income = sc.nextLong();
        System.out.println( calculateIncomeTax( income));
    }

    public static long calculateIncomeTax( long income){
        long tax1 = 0;
        long tax2 = 0;
        long tax3 = 0;
        if( income <= 250000){
            return income;
        } else if ( income <= 500000) {
            tax1 = 5 * income/100;
        } else if ( income <= 750000) {
            tax1 = 10 * income/100;
        } else if ( income <= 1000000) {
            tax1 = 15 * income/100;
        } else if (  income <= 1250000) {
            tax1 = 20 * income/100;
            System.out.println( tax1);
        } else if ( income <= 1500000) {
            tax1 = 25 * income/100;
        }else if( income>= 1500000){
            tax1 = 30 * income/100;
            System.out.println( tax1);
            if( income > 5000000){
                tax1 = 10 * tax1/100;
                System.out.println( tax1);
            } else if ( income > 10000000) {
                tax1= 15 * tax1/100;
            } else if ( income > 20000000) {
                tax1= 25 * tax1/100;
            }else if( income > 50000000){
                tax1 = 37 * tax1/100;
            }


        }

        tax1 = 4 * tax1/100 + tax1;

        return  tax1;
    }
}


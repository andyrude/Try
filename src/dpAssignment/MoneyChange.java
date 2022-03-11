package dpAssignment;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(expressSumExchg(n));
    }

    private static long expressSumExchg(int n){
        long[] arr = new long[n+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        for( int i=4; i<=n; i++){
            arr[i] = arr[i - 1] + arr[i - 3] + arr[i - 4];
        }
        return arr[n];
    }
}

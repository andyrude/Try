package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int noCoins = sc.nextInt();
        int[] arr = new int[noCoins];
        for (int i=0; i < noCoins; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(printMinCoinChange( amount, noCoins, arr));
    }

    private static int printMinCoinChange(int amount, int noCoins, int[] arr) {
        int[][] arr2 = new int[noCoins + 1][amount + 1];
        for (int i = 0; i <= noCoins; i++){
            for(int j=0; j <= amount; j++){
                if( j == 0 || i==0 ){
                    arr2[i][j] = 0;
                }else if( j - arr[i-1] < 0){
                    arr2[i][j] = arr2[i-1][j];
                }else if(j - arr[i-1] == 0){
                    arr2[i][j] = arr2[i-1][j] + 1;
                }else{
                    arr2[i][j] = arr2[i][j-arr[i-1]] + arr2[i-1][j];
                }
            }
        }
        return arr2[noCoins ][amount ];
    }
}

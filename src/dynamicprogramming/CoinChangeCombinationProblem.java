package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeCombinationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[val+1];
        dp[0] = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j <= val; j++){
                if( j - arr[i] < 0){
                    continue;
                }else if( dp[ j - arr[i]] >=1){
                    dp[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(dp));
    }
}

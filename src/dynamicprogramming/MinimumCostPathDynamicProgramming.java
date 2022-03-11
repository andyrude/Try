package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCostPathDynamicProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n][n];
        dp[n-1][n-1] = arr[n-1][n-1];
        findingMinimumCostPath( arr, dp, n-1, n-1, n-1, dp[n-1][n-1]);
        System.out.println(Arrays.toString(dp[0]));
        }

    private static void findingMinimumCostPath(int[][] arr, int[][] dp, int n, int cc, int cr, int op) {
            if(cc<0 || cr<0){
                return;
            }
            if(dp[cr][cc] == 0){
                dp[cr][cc] = arr[cr][cc] + op;
            }
            if(dp[cr][cc] > arr[cr][cc] + op){
                dp[cr][cc] = arr[cr][cc] + op;
            }
            findingMinimumCostPath(arr, dp, n, cc, cr-1, dp[cr][cc]);
            findingMinimumCostPath(arr, dp, n, cc-1, cr, dp[cr][cc]);
    }
}

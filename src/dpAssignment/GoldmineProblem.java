package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class GoldmineProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=0; i < n; i++) {
            int rows = sc.nextInt();
            int col = sc.nextInt();
            int[][] arr = new int[rows][col];
            for (int k = 0; k < rows; k++) {
                for (int j = 0; j < col; j++) {
                    arr[k][j] = sc.nextInt();
                }
            }
            System.out.println(getMaxGold(rows, col, arr));
        }
    }



    private static long getMaxGold(int row, int col, int[][] arr) {
        long[][] dp = new long[row][col];
        for(int i=0; i<row; i++){
            dp[i][0] = arr[i][0];
        }

        for(int j=1; j < col; j++){
            for (int i=0; i < row; i++){
               if(i==0){
                   dp[i][j] = Math.max(dp[i+1][j-1] + arr[i][j], dp[i][j-1] + arr[i][j]);
               }else if(i==row-1){
                   dp[i][j] = Math.max(dp[i-1][j-1] + arr[i][j], dp[i][j-1] + arr[i][j]);
               }else{
                   dp[i][j] = Math.max(Math.max(dp[i-1][j-1] + arr[i][j] , dp[i+1][j-1] + arr[i][j]),dp[i][j-1] + arr[i][j]);
               }
            }
        }
        long max = dp[0][col-1];
        for(int i=0; i < row-1; i++){
            max = max > dp[i+1][col-1]?max:dp[i+1][col-1];
        }
        System.out.println(Arrays.toString(dp[0]));
        System.out.println(Arrays.toString(dp[1]));
        return max;
    }
}

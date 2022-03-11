package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int f = sc.nextInt();
        boolean[][] dp = new boolean[n+1][f+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i==0 && j==0){
                    dp[i][j] = true;
                }else if( i==0 && j!=0){
                    dp[i][j] = false;
                }else if( j==0){
                    dp[i][j] = true;
                }else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                } else{
                    int val = arr[i-1];
                    if(val<=j){
                        if(dp[i][j-val]==true){
                            dp[i][j] = true;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dp[0]));
        System.out.println(Arrays.toString(dp[1]));
        System.out.println(Arrays.toString(dp[2]));
        System.out.println(Arrays.toString(dp[3]));
        System.out.println(Arrays.toString(dp[4]));
        System.out.println(Arrays.toString(dp[5]));
    }

}

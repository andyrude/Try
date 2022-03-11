package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dpo = houseRobber(n, arr);
        System.out.println(Arrays.toString(dpo));
    }

    private static int[] houseRobber(int n, int[] arr) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
                    dp[i+1] = Math.max( dp[i] , dp[i-1] + arr[i]);
        }
        return dp;
    }
}
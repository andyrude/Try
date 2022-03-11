package dpAssignment;

import java.util.Scanner;

public class TillingProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for(int i=0; i<in; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(tilProb(n,m));
        }
    }

    private static int tilProb(int n, int m) {
                int[] dp = new int[m+2];
                dp[0] = 0;
                dp[1] = 1;
                for(int i=2;i<=m+1;i++) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
                int[] dp2 = new int[n+2];
                dp2[0] = 0;
                dp2[1] = 1;
                for(int i=2;i<=n+1;i++) {
                    dp2[i] = dp2[i - 1] + dp2[i - 2];
                }
                if(n<m){
                    return dp[n+1];
                }else{
                    return dp[m+1] + dp2[n+1];
                }
    }
}

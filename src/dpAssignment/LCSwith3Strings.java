package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class LCSwith3Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        int n = str1.length();
        int m = str2.length();
        int l = str3.length();
        System.out.println(lcs( n, m, l, str1, str2, str3));
    }

    private static int lcs(int n, int m, int l, String str1, String str2, String str3) {
        int dp[][][] = new int[n][m][l];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < l; k++) {
                    dp[i][j][k] = 0;
                    if (str1.charAt(i) == str2.charAt(j) && str1.charAt(i) == str3.charAt(k)) {
                        dp[i][j][k] = ((i > 0 && j > 0 && k > 0) ? dp[i - 1][j - 1][k - 1] : 0) + 1;
                    } else {
                        dp[i][j][k] = Math.max(Math.max(i > 0 ? dp[i - 1][j][k] : 0, j > 0 ? dp[i][j - 1][k] : 0), k > 0 ? dp[i][j][k - 1] : 0);
                    }
                }
            }
        }
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(Arrays.toString(dp[i][j]) + " ");
            }
            System.out.println("");
        }
        return dp[n-1][m-1][l-1];
    }
}


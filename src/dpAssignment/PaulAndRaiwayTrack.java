package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class PaulAndRaiwayTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[m];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int j=0; j<m; j++){
            arr2[j] = sc.nextInt();
        }
        System.out.println(Arrays.toString(getMaxValue(n, arr, m, arr2)));
    }

    private static int[] getMaxValue(int n, int[] arr, int m, int[] arr2) {
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        int k=0, c=0;
        int[] dp = new int[n];
        for (int i=0; i < n ; i++){
            k=0;
            c=0;
            for (int j = i;j < n; j++){
                while ( k < m){
                    if( arr[i] == arr2[k] ){
                        k = k + 2;
                    }
                }
            }
            System.out.println();
            dp[i] = c;
        }
        return dp;
    }
}

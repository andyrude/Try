package dpAssignment;

import java.util.Scanner;

public class Knap01sack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vL = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        getMaxValue( n, vL, arr1, arr2);
    }

    private static void getMaxValue(int n, int M, int[] W, int[] V) {
        int B[][] = new int[n + 1][M + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                B[i][j] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                B[i][j] = B[i - 1][j];

                if ((j >= W[i - 1]) && (B[i][j] < B[i - 1][j - W[i - 1]] + V[i - 1])) {
                    B[i][j] = B[i - 1][j - W[i - 1]] + V[i - 1];
                }
            }
        }
        System.out.println(B[n][M]);
    }
}
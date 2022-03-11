package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class TilingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(noOfWays(n));

    }

    private static int noOfWays(int n) {
        int tile[] = new int[n+2];
        tile[0] = 0; tile[1] = 1;
        for(int i=2;i<=n+1;i++) {
            tile[i] = tile[i - 1] + tile[i - 2];
        }
        return tile[n+1];
    }
}

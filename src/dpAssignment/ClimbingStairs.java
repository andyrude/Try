package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tStr = sc.nextInt();
        System.out.println(totalWays(tStr));
    }

    private static int totalWays(int tStr) {
        int[] steps = new int[tStr + 1];
        steps[0] = 1;
        steps[1] = 1;
        for(int i=2; i <=tStr; i++){
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[tStr];
    }
}

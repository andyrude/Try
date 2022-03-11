package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        int cp = countPaths( n, arr);
        System.out.println(cp);
        System.out.println(Arrays.toString(arr));
    }

    private static int countPaths(int n, int arr[]) {
        if(n==0){
            return 1;
        }if( n < 0){
            return 0;
        }if( arr[n] != 0){
            return arr[n];
        }
        int nm1 = countPaths(n-1, arr);
        int nm2 = countPaths(n-2, arr);
        int nm3 = countPaths(n-3, arr);
        int cp = nm1 + nm2 + nm3;
        arr[n] = cp;
        return cp;
    }

}

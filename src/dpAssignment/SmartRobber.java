package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SmartRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int lenArr = sc.nextInt();
            int[] arr = new int[lenArr];
            for(int j=0; j<lenArr; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(maxSmartRobb(arr,lenArr));
        }
    }

    private static int maxSmartRobb(int[] arr, int lenArr) {
        int[] ar = new int[lenArr];
        ar[0] = arr[0];
        ar[1] = arr[1];
        ar[2] = ar[0] + arr[2];
        for(int i=3; i<lenArr; i++){
            ar[i] = Math.max(ar[i-2] + arr[i], ar[i-3] + arr[i]);
        }
        System.out.println(Arrays.toString(ar));
        return ar[lenArr-1]>ar[lenArr-2]?ar[lenArr-1]:ar[lenArr-2];
    }
}

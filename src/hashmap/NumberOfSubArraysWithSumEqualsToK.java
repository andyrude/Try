package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfSubArraysWithSumEqualsToK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int k = sc.nextInt();
        System.out.println(numberOfSubstringsWithSumEqualsToK(arr, k));
    }

    private static int numberOfSubstringsWithSumEqualsToK(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int tol = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            tol += arr[i];
            if (map.containsKey(tol - k)) {
                ans += map.get(tol - k);
            }
            if ( map.containsKey( tol)){
                map.put( tol, map.get( tol) + 1);
            }else{
                map.put( tol, 1);
            }
        }
        return ans;
    }
}
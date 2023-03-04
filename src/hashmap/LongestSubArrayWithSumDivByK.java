package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSumDivByK {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(",");
        int[] arr = new int[ str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        int k = sc.nextInt();
        System.out.println( getLongestSubArrayWithSumDivByK( arr, k));
    }

    private static int getLongestSubArrayWithSumDivByK(int[] arr, int k) {

        HashMap< Integer, Integer> map = new HashMap<>();
        map.put( 0, -1);
        int ans = 0, tol = 0;
        for ( int i = 0; i < arr.length; i++){
            tol += arr[i];
            int key = ((tol % k) + k) % k;
            if ( map.containsKey( key)){
                ans = Math.max( ans, i - map.get( key));
            }else{
                map.put( key, i);
            }
        }
        return ans;
    }
}

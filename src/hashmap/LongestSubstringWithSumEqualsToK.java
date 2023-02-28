package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithSumEqualsToK {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int[] ints = new int[ str.length];
        for ( int i = 0; i < str.length; i++){
            ints[i] = Integer.parseInt( str[i]);
        }
        int k = sc.nextInt();
        System.out.println( longestSubstringWithSumEqualsToK( ints, k));
    }

    private static int longestSubstringWithSumEqualsToK(int[] ints, int k) {

        HashMap< Integer, Integer> map = new HashMap<>();
        map.put( 0 , -1);
          int ans = 0, sum = 0;
        for ( int i = 0; i < ints.length; i++){

            sum += ints[i];
            if ( map.containsKey( sum - ints[i])){
                ans = Math.max( ans, i - map.get( sum - ints[i]));
            }
            if ( !map.containsKey( sum)){
                map.put( sum, i);
            }
        }
        return ans;
    }
}

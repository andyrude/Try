package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class SubArraysWithKDiffInts {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split("");
        int[] arr = new int[ str.length];
        for ( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        int k = sc.nextInt();
        System.out.println( getNumberOfSubArraysWithKDiff( arr,  k) - getNumberOfSubArraysWithKDiff( arr, k - 1));
    }

    private static int getNumberOfSubArraysWithKDiff(int[] arr, int k) {
        HashMap< Integer, Integer> map = new HashMap<>();

        int rel = 0, ans = 0, distinct = 0;

        for ( int acq = 0; acq < arr.length; acq++){

            int currKey = arr[ acq];
            if ( !map.containsKey( currKey)){
                map.put( currKey, 1);
                distinct++;
            }else{
                map.put( currKey, map.get( currKey) + 1);
            }


            while ( rel < acq && distinct > k){
                int discard = arr [rel];
                if ( map.get( discard) == 1){
                    map.remove( discard);
                    distinct--;
                }else{
                    map.put( discard, map.get( discard) - 1);
                }
                rel++;
            }

            ans += acq - rel + 1;

        }
        return ans;
    }
}

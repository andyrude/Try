package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfSubStringsWithExactKUniqueCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.println( getNumberOfSubstringsWithExactKUniSubstr( str, k));
    }

    private static int getNumberOfSubstringsWithExactKUniSubstr(String str, int k) {
        HashMap< Character, Integer> map = new HashMap<>();
        int ans = 0, rel = 0;
        int distinct = 0;
        for ( int acq = 0; acq < str.length(); acq++){

            Character currChar = str.charAt( acq);

            if( map.containsKey( str.charAt( acq))){
                map.put( currChar, map.get( currChar) + 1);
            }else{
                map.put( currChar, 1);
                distinct++;
            }

            while( rel< acq && distinct > k){
                char discard = str.charAt( rel);
                rel++;
                map.put( discard, map.get( discard) - 1);

                if ( map.get( discard) == 0){
                    map.remove( discard);
                    distinct--;
                }

            }
            if ( distinct == k){
                ans = Math.max( ans, acq - rel + 1);
            }
        }
        return ans == 0 ? -1 : ans;
    }
}

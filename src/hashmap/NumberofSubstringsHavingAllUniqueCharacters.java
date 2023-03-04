package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberofSubstringsHavingAllUniqueCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        System.out.println( getNumberOfSubstringsHavingAllUniqueCharacters( str));
    }

    private static int getNumberOfSubstringsHavingAllUniqueCharacters(String str) {

        HashMap< Character, Integer> map = new HashMap<>();
        int ans = 0, rel = 0;
        for ( int acq = 0; acq < str.length(); acq++){
            while( rel < acq && map.containsKey( str.charAt( acq))){
                map.remove( str.charAt( rel));
                rel++;
            }
            map.put( str.charAt( acq), acq);
            ans += acq - rel + 1;
        }
        return ans;
    }
}

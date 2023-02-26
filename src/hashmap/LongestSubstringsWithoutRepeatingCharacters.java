package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringsWithoutRepeatingCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        System.out.println( getLongestSubstringWithoutRepeatingChars( str));
    }

    private static int getLongestSubstringWithoutRepeatingChars(String str) {

        HashMap< Character, Integer> map = new HashMap<>();
        int rel = 0, ans = 0;
        for ( int i = 0; i < str.length(); i++){
            while( rel < i && map.containsKey( str.charAt( i))){

                Character disChar = str.charAt( rel);
                map.remove( disChar);
                rel +=1;
            }
            map.put( str.charAt(i), i);
            ans = Math.max( ans, i - rel + 1);
        }
        return ans;
    }
}

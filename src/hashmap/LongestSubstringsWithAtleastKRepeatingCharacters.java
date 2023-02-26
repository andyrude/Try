package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringsWithAtleastKRepeatingCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.println( longestSubstringWithAtleastKUniqueChars( str, k));
    }

    private static int longestSubstringWithAtleastKUniqueChars(String str, int k) {

        HashMap< Character, Integer> map = new HashMap<>();
        HashMap< Character, Integer> map1 = new HashMap<>();
        int rel = 0, ans = 0;
        for ( int acq = 0; acq < str.length(); acq++){
            Character currChar = str.charAt( acq);
            if( map.containsKey( currChar)){
                map.put( currChar, map.get( currChar) + 1);
                ans = Math.max( ans, acq - rel + 1);
            }else{
                map.put( currChar, 1);
            }
        }
        return ans;
    }
}

package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfSubstringsHavingAtleastKUniqueCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.println( numberOfSubstringsHavingAtleastKUniqueChars( str, k));
    }

    private static int numberOfSubstringsHavingAtleastKUniqueChars(String str, int k) {
        HashMap< Character, Integer> map = new HashMap<>();
        int dis = 0, rel = 0, ans = 0;
        for ( int acq = 0; acq < str.length(); acq++){
            Character ch = str.charAt( acq);
            if ( map.containsKey( ch)){
                map.put( ch, map.get( ch) + 1);
            }else{
                map.put( ch, 1);
                dis++;
            }
            if ( dis >= k){
                ans += acq - rel + 1;
            }
        }
        return ans;
    }
}

package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LengthOfDistinctLongestSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getLengthOfDistinctSubstring(str));
    }

    private static int getLengthOfDistinctSubstring(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        int rel = 0;
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i))) {

                    rel = map.get(str.charAt(i));

                map.put( str.charAt(i), i);
            } else {
                map.put(str.charAt(i), i);
            }

            if (i - rel> ans) {
                ans = i - rel;
            }
        }
        return  ans;
    }
}

package dynamicprogramming;

import java.util.HashMap;
import java.util.Scanner;

public class PalindromePratitioningII {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        System.out.println( getMin( str));
    }

    private static int getMin(String str) {
        HashMap< String, Integer> map = new HashMap<>();
        return getVal( 0, str.length(), map, str);
    }

    private static int getVal(int start, int end, HashMap<String, Integer> map, String str) {

        String st = start + "-" + end;
        if( map.containsKey( st)){
            return map.get( st);
        }
        if( isPalindrome( str.substring( start))){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for( int i = start; i < str.length(); i++){
            if( isPalindrome( str.substring( i + 1))){
                int m = getVal( i + 1, end, map, str) + 1;
                min = Math.min( min, m);
                map.put( st, min);
            }
        }
        return min;
    }

    private static boolean isPalindrome(String substring) {
        int start = 0;
        int end = substring.length() - 1;
        while ( start <= end){
            if ( substring.charAt(start) != substring.charAt( end )){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

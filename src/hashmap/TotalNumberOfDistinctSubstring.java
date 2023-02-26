package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class TotalNumberOfDistinctSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        System.out.println( getMaxLength( str));
    }

    private static int getMaxLength(String str) {

        HashMap< Character, Integer> map = new HashMap<>();
        int release = 0;
        int answer = 0;
        for ( int  acq = 0; acq < str.length(); acq++){
            while( release < acq && map.containsKey( str.charAt( acq))){
                Character disChar = str.charAt( release);
                map.put( disChar, map.get( disChar) - 1);
                if ( map.get( disChar) == 0){
                    map.remove( disChar);
                }
                release += 1;
            }
            map.put(str.charAt( acq), 1);
            answer +=  acq - release + 1;
        }
        return answer;
    }
}

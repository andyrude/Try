package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfSubArraysDivByK {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split("");
        int[] ints = new int[ str.length];
        for ( int  i = 0; i < ints.length; i++){

            ints[i] = Integer.parseInt( str[i]);
        }
        int k = sc.nextInt();
        System.out.println( getNumOfSubArrDivByK( ints, k));
    }

    private static int getNumOfSubArrDivByK(int[] ints, int k) {

        HashMap< Integer, Integer> map = new HashMap<>();
        map.put( 0, 0);
        int ans = 0, tol = 0;
        for ( int i = 0; i < ints.length; i++){

            tol += ints[i];

            if ( map.containsKey( tol % k == 0)){
                
            }
        }
        return 0;

    }
}

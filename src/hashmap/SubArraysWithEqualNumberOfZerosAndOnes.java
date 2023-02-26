package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class SubArraysWithEqualNumberOfZerosAndOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int[] ints = new int[str.length];
        for ( int i = 0; i < str.length; i++){
            ints[i] = Integer.parseInt( str[i]);
        }
        System.out.println( getSubArraysWithEqualNumberOdZerosAndOnes( ints));
    }

    private static long getSubArraysWithEqualNumberOdZerosAndOnes(int[] ints) {
        HashMap< String, Integer> map = new HashMap<>();
        map.put( "0 0", 1);
        long tol = 0;
        int z1 = 0, z2 = 0, z3 = 0;
        for ( int acq = 0; acq < ints.length; acq++){
            if( ints[ acq] == 0){
                z1++;
            }else if( ints[ acq] == 1){
                z2++;
            } else if ( ints[ acq] == 2) {
                z3++;
            }
            long k = z2 - z1;
            long l = z3 - z2;
            String key = String.valueOf( k) + " " + String.valueOf( l);
            if ( map.containsKey( key)){
                tol += map.get( key);
                map.put( key, map.get( key) + 1);
            }else {
                map.put( key, 1);
            }
        }
        return tol;
    }


}

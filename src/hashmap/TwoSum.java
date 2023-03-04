package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int k = sc.nextInt();
        int[] arr = new int[ str.length];
        for ( int i = 0 ; i < str.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        getTwoSumArr( arr, k);
    }

    private static void getTwoSumArr(int[] arr, int k) {

        HashMap< Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < arr.length; i++){
            int secVal = k - arr[i];
            if ( map.containsKey( secVal)){
                System.out.println("["+ map.get( secVal) + "," + i + "]");
                break;
            }
            map.put( arr[i], i);
        }
    }
}

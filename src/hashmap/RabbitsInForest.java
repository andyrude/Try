package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RabbitsInForest {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[ str.length];
        for ( int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt( str[i]);
        }
        System.out.println( getMinRabits( arr));
    }

    private static int getMinRabits(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int rabbits = 0;
        List<Integer> list =  map.keySet().stream().toList();
        for (int val : list) {

            int sol = map.get(val);

            if ( val == 0){
                rabbits += sol;
            } else if (sol % (val + 1) == 0) {
                rabbits  += (sol / (val + 1)) * (val + 1);
            } else {
                rabbits += ((sol / (val + 1)) + 1 ) * (val+ 1);
            }
        }
        return rabbits;
    }
}

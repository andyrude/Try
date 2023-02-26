package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SecondMaxVal {
    public static void main(String[] args){
        int[] arr = { 2,2,1,4,5};
        secondMaxVal(arr);
    }

    private static void secondMaxVal(int[] arr) {
        HashMap< Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < arr.length; i++){
            if ( map.containsKey(arr[i])){
                int j = map.get( arr[i]);
                j += 1;
                map.replace( arr[i], j);
            }else {
                map.put( arr[i],1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        System.out.println( list.get(list.size() - 2));
    }

    }

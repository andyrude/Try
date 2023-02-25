package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SlidingWindow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int windowSize = sc.nextInt();
        System.out.println(getSlidingWindowAns(n, arr, windowSize));
    }

    private static ArrayList< Integer> getSlidingWindowAns(int n, int[] arr, int windowSize) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < windowSize; i++) {
            if (map.containsKey(arr[i])) {
                int times = map.get(arr[i]);
                map.put(arr[i], times + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        list.add(map.size());
        for (int i = windowSize; i < n; i++) {
            if (map.get(arr[i - 3]) != 1) {
                map.put(arr[i - 3], map.get(arr[i - 3]) - 1);
            } else {
                map.remove(arr[i - 3]);
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            list.add(map.size());
        }
        System.out.println( list);
        return list;
    }
}

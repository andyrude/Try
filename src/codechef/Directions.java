package codechef;

import java.util.*;

public class Directions {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=0;i<a;i++) {

            int c = sc.nextInt();
            int b = c % 4;
            HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
            hash_map.put(0, "North");
            hash_map.put(1, "East");
            hash_map.put(2, "South");
            hash_map.put(3, "West");
            System.out.println(hash_map.get(b));
            sc.nextLine();
        }
    }
}

package datastructures;

import java.util.Scanner;

public class Mazepath_D2 {
    public static int paths(int[][] arr, int cr, int cc, int dr, int dc, String path){
        if(cr > dr || cc > dc  ){
            return 0;
        }
        if(cr == dr && cc == dc){
            System.out.print(path + " ");
            return 1;
        }
        int count=0;
        count = count + paths(arr, cr+1, cc, dr, dc, path + "V" );
        count = count + paths(arr, cr, cc+1, dr, dc, path + "H" );
        if(cr + cc == dr || cr == cc){
            count = count + paths(arr, cr+1, cc+1, dr, dc, path + "D" );
        }
        return count;
    }

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[][] arr = new int[input][input];
        int str = paths(arr, 0, 0, input-1, input-1, "");
        System.out.println("\n"+str);
    }
}

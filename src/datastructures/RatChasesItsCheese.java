package datastructures;

import java.util.*;
public class RatChasesItsCheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[a][b];
        for(int i=0; i<a; i++){
            String op = sc.nextLine();
            for(int j=0; j<b; j++){
                arr[i][j] = op.charAt(j);
            }
        }
        int[][] newInt = new int[a][b];
        findNewPath(arr,newInt,0,0, a, b);
    }

    private static void findNewPath(char[][] arr, int[][] newInt, int a, int b, int rowMax, int colMax) {
        if( a >= rowMax && b >= colMax){
            return;
        }
        if(arr[a][b] == 'X'){
            return;
        }
        newInt[a][b] = 1;
        findNewPath(arr, newInt, a+1, b, rowMax, colMax);
        findNewPath(arr, newInt, a, b+1, rowMax, colMax);
    }
}
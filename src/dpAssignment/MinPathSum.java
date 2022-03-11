package dpAssignment;

import java.util.Scanner;

public class MinPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[][] arr = new long[a][b];
        for(int i=0; i < a; i++){
            sc.nextLine();
            for(int j=0; j < b; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        getMinPathSum( a, b, arr);
    }

    private static void getMinPathSum(int a, int b, long[][] arr) {
        long[][] arr2 = new long[a][b];
        arr2[0][0] =  arr[0][0];
        for(int i=1; i<a; i++){
            arr2[0][i] = arr2[0][i-1] + arr[0][i];
        }
        for( int i=1; i < a; i++ ){
            for( int j =0; j < b; j++ ){
                    if(j==0) {
                        arr2[i][j] = arr2[i - 1][j] + arr[i][j];
                    }else{
                        arr2[i][j] = Math.min(arr2[i-1][j] + arr[i][j], arr2[i][j-1] + arr[i][j]);
                    }
            }
        }
        System.out.println(arr2[a-1][b-1]);
    }
}

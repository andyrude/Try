package datastructures;

import java.util.Scanner;

public class NQueens {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        printQueens(arr, "", 0);
        System.out.println(count);
    }

    public static void printQueens(int arr[][], String path, int row) {

        if (row == arr.length) {
            System.out.println(path);
            count++;
            return;
        }

        for (int col = 0; col < arr.length; col++) {
            if (safePlaceForQueen(arr, row, col) == true) {
                arr[row][col] = 1;
                printQueens(arr, path + row + "-" + col + ",", row + 1);
                arr[row][col] = 0;
            }
        }
    }

    private static boolean safePlaceForQueen(int[][] arr, int row, int col) {
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}

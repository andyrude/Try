package datastructures;

import java.util.Scanner;

public class MazeWithNoBackwardTracking {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int arr[][] = new int[input1 - 1][input2 - 1];
        int rC = 0;
        int cC = 0;
        String path = "";
        mazePath(arr, rC, cC, path, input1 - 1, input2 - 1);
        System.out.println("");
        System.out.println(count);
    }

    private static void mazePath(int[][] arr, int rC, int cC, String path, int input1, int input2) {

        if (rC == input1 && cC == input2) {
            System.out.print(path + " ");
            count++;
            return;
        }

        if (rC > input1 || cC > input2) {
            return;
        }

        mazePath(arr, rC, cC + 1, path + "V", input1, input2);
        mazePath(arr, rC + 1, cC, path + "H", input1, input2);


        }
    }

package datastructures;

import java.util.Scanner;

public class ClimbingStaircaseUsingOneOrTwoStairsAtATime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_stairs = sc.nextInt();
        String cPath = new String("");
        paths(0,total_stairs, cPath);
    }

    public static void paths(int cStep, int tStair, String path){

        if(cStep == tStair){
            System.out.println(path);
            return;
        }
        if(cStep > tStair){
            return;
        }
        paths(cStep+1, tStair, path+1);
        paths(cStep+2, tStair, path+2);
    }

}

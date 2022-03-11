package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SnookerMatch {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();

        for(int i=0; i <a ; i++){
            if(i>0){

            array1.add(sc.nextInt()+array1.get(i-1));
            array2.add(sc.nextInt()+array2.get(i-1));
            }
            if(i==0){
                array1.add(sc.nextInt());
                array2.add(sc.nextInt());
            }
        }
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        for(int i=0; i<a; i++){
            array3.add(array1.get(i)-array2.get(i));
        }
        int min = Collections.min(array3);
        int max = Collections.max(array3);
        if(-1*min>max){
            System.out.println("2 "+-1*min);
        }
        else {
            System.out.println("1 "+max);
        }

    }
}

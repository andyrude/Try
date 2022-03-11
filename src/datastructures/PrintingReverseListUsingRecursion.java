package datastructures;

import java.util.Scanner;
import java.util.Arrays;

public class PrintingReverseListUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int arr[] = new int[input];
        for(int i=0; i<input; i++){
            scanner.nextLine();
            arr[i] = scanner.nextInt();
        }
        reverseArrayPrint(arr,input);
    }

    public static void reverseArrayPrint(int arr[], int input){
        if(input>0){
            System.out.println(arr[input-1]);
            input= input-1;
            reverseArrayPrint(arr,input);
        }else {
            return;
        }
    }
}

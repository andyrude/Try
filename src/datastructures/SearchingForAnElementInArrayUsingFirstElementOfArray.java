package datastructures;

import java.util.Scanner;

public class SearchingForAnElementInArrayUsingFirstElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int arr[] = new int[input];
        for(int i=0; i<input; i++){
            sc.nextLine();
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        int cs = 0;
        int index = extractingElementFramStart(arr,cs,search);
        System.out.println(index);
    }

    private static int extractingElementFramStart(int[] arr, int cs, int search){
            if(cs == arr.length){
                return -1;
            }

            int recAns = extractingElementFramStart(arr, cs+1, search);

            if(arr[cs] == search && recAns == -1){
                return cs;
            }

            return recAns;
    }
}

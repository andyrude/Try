package datastructures;

import java.util.Scanner;

public class IsArraySorted {
    public static boolean sort(int[] a, int currentIndex){
            if(currentIndex <= a.length - 1){
                if(a[currentIndex] < a[currentIndex+1]){
                    return true;
                }else{
                    return false;
                }
            }
            return sort(a,currentIndex+1);
        }
        public static void main(String args[]) {
            // Your Code Here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            boolean res = sort(a, 0);
            System.out.println(res);
        }
    }


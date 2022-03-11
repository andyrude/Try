package dpAssignment;

import java.util.Scanner;

public class CNumberOfBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
           int c = sc.nextInt();
            System.out.println(cNumberOfBinaryStrings(c));
        }

    }

    private static int cNumberOfBinaryStrings(int n) {
        int a[] = new int [n];
        int b[] = new int [n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
            System.out.print(b[i] + " ");
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return a[n-1] + b[n-1];
    }
}

package dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] nArr = new BigInteger[n + 1];
        BigInteger fib = fib( n, nArr);
        System.out.println(fib);
    }

    private static BigInteger fib(int n, BigInteger[] nArr) {
        if( n==0 || n==1){
            return BigInteger.valueOf(n);
        }
        if( nArr[n] != null){
            return nArr[n];
        }
        BigInteger fib1 = fib( n-1, nArr);
        BigInteger fib2 = fib( n-2, nArr);
        BigInteger fibn = fib1.add(fib2);
        nArr[n] = fibn;
        return fibn;
    }
}

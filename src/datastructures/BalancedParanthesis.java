package datastructures;

import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oBracket = 0;
        int cBracket = 0;
        orderOfParenthesis(n, oBracket, cBracket, "");
    }

    private static void orderOfParenthesis(int n, int oBracket, int cBracket, String order) {
        if(oBracket == n && cBracket == n){
            System.out.println(order);
            return;
        }
        if(cBracket < oBracket){
            orderOfParenthesis(n, oBracket, cBracket+1, order + ")");
        }
        if(oBracket < n){
            orderOfParenthesis(n,oBracket+1, cBracket, order + "(");
        }
    }
}

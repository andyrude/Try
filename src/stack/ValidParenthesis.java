package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] pare = new char[str.length()];
        pare = str.toCharArray();
        if( validPar(pare, str.length(), str)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static boolean validPar(char[] pare, int length, String str) {
        Stack<String> stack = new Stack<String>();
        for( int i=0; i < length; i++){
            if( pare[i] == '('){
                stack.push("(");
            }else if( pare[i] == ')'){
                try {
                    stack.pop();
                }catch (Exception e){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

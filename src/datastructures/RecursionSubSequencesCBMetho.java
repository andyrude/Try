package datastructures;

import java.util.Scanner;

public class RecursionSubSequencesCBMetho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        subSeq(inp,"");
    }

    private static void subSeq(String inp , String out){
        if( inp.length() == 0 ){
            System.out.println(out);
            return;
        }
        char ch0th = inp.charAt(0);
        String left = inp.substring(1);
        subSeq( left, out + ch0th);
        subSeq( left, out);
    }
}

package datastructures;

import java.util.*;
public class RecursionSubSequences {
    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        String resultOfSubstring = str.substring(1);
        ArrayList<String> res = gss(resultOfSubstring);

        ArrayList<String> myResult = new ArrayList<>();
        for (String stringResult : res) {
            myResult.add("" + stringResult);
        }
        for (String stringResult : res) {
            myResult.add(ch + stringResult);
        }
        return myResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> list = gss(str);
        System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
        System.out.println(list.size());
    }
}


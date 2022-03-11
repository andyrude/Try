package codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
        sc.nextLine();
        BigInteger bi = new BigInteger(sc.nextLine());
        StringBuffer sb = new StringBuffer(String.valueOf(bi.add(BigInteger.valueOf(1))));
        StringBuffer ob = new StringBuffer(String.valueOf(sb));
        int j=0;
        while(j>=0){
            if(ob.toString().equals(sb.reverse().toString())){
                break;
            }else{
                j++;
                sb = new StringBuffer(String.valueOf(new BigInteger(ob.toString()).add(BigInteger.valueOf(1))));
                ob = new StringBuffer(String.valueOf(sb));
            }
        }
            System.out.println(sb);
    }
    }
}

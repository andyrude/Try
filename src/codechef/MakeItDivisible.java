package codechef;

import java.util.Scanner;

public class MakeItDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a; i++){
            sc.nextLine();
            int b = sc.nextInt();
            String num="1";
            for(int j=1; j<b; j++){
                num = num+"0";
            }
            int nm = Integer.parseInt(num);
            while (nm%3!=0){
                nm = nm+1;
            }
            while (nm%9==0){
                nm = nm + 3;
            }
            System.out.println(nm);
        }
    }
}

package codechef;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i=0;i<times;i++){
            sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int j=0; j<c; j++){
                if(j%2==0){
                    a = 2 * a;
                    continue;
                }else {
                    b = b * 2;
                    continue;
                }
            }
            if(a>b){
                System.out.println(a/b);
            }if(b>a) {
                System.out.println(b/a);
            }
        }
    }
}

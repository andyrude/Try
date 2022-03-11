package codechef;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            sc.nextLine();
            int c=0;
            for(int j=0; j<7; j++){
                int b = sc.nextInt();
                if(b==1){
                  c++;
                }else {
                    c = c-1;
                }
            }
            if(c>0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}

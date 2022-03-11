package codechef;

import java.util.Scanner;

public class WhichMixture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            sc.nextLine();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(b>0 & c>0){
                System.out.println("Mixture");
                continue;
            }if(b==0){
                System.out.println("Liquid");
                continue;
            }if(c==0){
                System.out.println("Solid");
            }
        }
    }
}

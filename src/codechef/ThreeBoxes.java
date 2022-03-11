package codechef;

import java.util.Scanner;

public class ThreeBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_input = sc.nextInt();
        for (int i = 0; i < no_input; i++) {
            sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(a+b+c<=d){
                System.out.println("1");
                continue;
            }if(a+b<=d | a+c<=d){
                System.out.println("2");
                continue;
            }else{
                System.out.println("3");
            }
        }
    }
}


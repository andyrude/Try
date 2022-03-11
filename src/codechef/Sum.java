package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<=a; i++){
            String b = sc.nextLine();
            String[] arrOfStr = b.split(" ");
            System.out.println(arrOfStr[0]);
            System.out.println(arrOfStr[1]);

        }
        sc.close();
    }
}

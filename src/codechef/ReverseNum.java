package codechef;

import java.util.Scanner;

public class ReverseNum {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            sc.nextLine();
            int i=0;
            for(i=0;i<=a;i++){
                StringBuilder d = new StringBuilder(sc.nextLine());
                System.out.println(Integer.parseInt(String.valueOf(d.reverse())));
                // your code goes here
            }
            System.out.println(i);
        }
}


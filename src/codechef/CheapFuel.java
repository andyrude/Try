package codechef;

import java.util.Scanner;

public class CheapFuel {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                scanner.nextLine();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int k = scanner.nextInt();
                x = x + a*k;
                y = y + b*k;
                if (x < y) {
                    System.out.println("PETROL");
                }
                if (x > y) {
                    System.out.println("DIESEL");
                } else {
                    System.out.println("SAME PRICE");
                }
                System.out.println(x);
                System.out.println(y);
            }
        } catch (Exception e) {
            return;
        }
    }
}

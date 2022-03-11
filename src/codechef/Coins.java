package codechef;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++){
            scanner.nextLine();
            int xCoins = scanner.nextInt();
            int yCoins = scanner.nextInt();
            if(xCoins%2!=0){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
        }catch(Exception e){
                return;
        }
    }
}


package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class MEX_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i <p; i++){
            sc.nextLine();
            arrayList.add(sc.nextInt());
            int test_num = 0;
            while (arrayList.contains(test_num) == true){
                test_num++;
            }
            System.out.println(test_num);
        }
    }
}

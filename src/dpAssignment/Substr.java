package dpAssignment;

import java.util.*;

public class Substr {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String st = sc.nextLine();
        char[] str = st.toCharArray();
        System.out.println( subString( st, str.length));
    }

    static int subString(String str, int n) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                   String st = String.valueOf(str.charAt(i));

                for (int k = i; k <= j; k++) {
                    st = st + str.charAt(k);
                }
                    list.add( st);
            }
        }

        HashMap<String, Integer> map = new HashMap<>();

        for ( int i  = 0 ; i < list.size(); i++){
            char[] arr = list.get(i).toCharArray();
            Arrays.sort( arr);
            String p =  String.valueOf(arr[0]);
            String m = new String( arr);
            for( int j = 1; j < arr.length  ; j++){
                if( m.charAt(j - 1) != m.charAt( j )){
                    p = p + m.charAt(j);

                }
            }
            map.put( p, 1);
        }
        return  map.size();
        }
}

package codechef;

public class PrintStringUsingRecursion {
    private static void printChar(String str){
        if(str.length() == 0){
            return;
        }
        char c0th = str.charAt(0);
        System.out.println(c0th);

        str = str.substring(1);
        String p = "";
        System.out.print(p);
        printChar(str);
    }

    public static void main(String[] args) {

        String str = "JAVA";
        printChar(str);
    }
}

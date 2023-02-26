package codechef;

public class ReturningIndex {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 5};
        int target = 78;
        index( nums, target);
    }

    private static void index(int[] nums, int target) {
        int i = 0;
        int j = 0;
        for ( i = 0; i < nums.length - 1; i++){
            for (  j =1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    break;
                }
            }
            if ( j != nums.length){
                break;
            }
        }
        if ( i == nums.length - 1){
            System.out.println(-1);
        }else {
            System.out.println( "[" + i + "," + j+ "]");
        }
    }
}

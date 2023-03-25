package trees;

public class MaximumDepthOfTree {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.val = 1;
        tree.leftChild = new BinaryTree();
        tree.leftChild.val = 5;
        tree.rightChild = new BinaryTree();
        tree.rightChild.val = 7;
        System.out.println( height( tree));
    }

    private static int height(BinaryTree tree) {

        if ( tree == null){
                return 0;
            }

            int left = height( tree.leftChild);
            int right = height( tree.rightChild);

            return 1 + Math.max( left, right);
    }
}

package codechef;

import java.util.Stack;

public class BInaryTree{

    private  TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
//        can be generic as well
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode sec = new TreeNode(2);
        TreeNode thi = new TreeNode(3);
        TreeNode fore = new TreeNode(4);
        TreeNode fve = new TreeNode(5);
        root = first;
        first.left = sec;
        first.right = thi;
        sec.left = fore;
        sec.right = fve;
    }

    public static void main(String[] args){
        BInaryTree bt = new BInaryTree();
        bt.createBinaryTree();
        bt.preOrderTraversal(bt.root);
    }

    public void preOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }


    public Stack<TreeNode> traversal(){
        if(root == null){
            return new Stack<TreeNode>();
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data + " ");
            if(temp.right != null){
                stack.push(temp);
            }if(temp.left!=null){
                stack.push(temp);
            }
        }
        return stack;
    }
}


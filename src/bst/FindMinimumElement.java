package bst;

/**
 * Created by manish on 1/24/15.
 */
public class FindMinimumElement {
    public static BinaryTreeNode findMin(BinaryTreeNode root){
        if(root == null) return null;
        if(root.left == null) return root;
        else
            return findMin(root.left);
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(7);
        root.left = new BinaryTreeNode(5);
        root.left.right = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(4);
        root.right = new BinaryTreeNode(9);
        System.out.println(findMin(root));
    }
}

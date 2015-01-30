package bst;

/**
 * Created by manish on 1/24/15.
 */
public class FindElement {
    public static BinaryTreeNode findElement(BinaryTreeNode root, int data) {
        if (root == null) return null;
        else {
            if (data == root.val) return root;
            else {
                if (data < root.val)
                    return findElement(root.left, data);
                else return findElement(root.right, data);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(7);
        root.left = new BinaryTreeNode(5);
        root.right = new BinaryTreeNode(9);
        System.out.println(findElement(root, 6));
    }
}
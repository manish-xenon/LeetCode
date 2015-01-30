package trees;

/**
 * Created by manish on 1/14/15.
 */
public class MinimumDepthTree {
    public static int heightTree(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left != null && root.right != null)
            return Math.min(heightTree(root.left), heightTree(root.right)) + 1;
        if (root.left != null)
            return heightTree(root.left) + 1;
        else
            return heightTree(root.right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int minht = heightTree(root);
        System.out.println(minht);
    }
}


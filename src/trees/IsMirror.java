package trees;

/**
 * Created by manish on 1/25/15.
 */
public class IsMirror {
    public static boolean isMirror(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        else return root1.val == root2.val && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }

    public static void main(String args[]) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);

        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        root1.left.left.left = new TreeNode(8);
        root1.left.left.right = new TreeNode(9);

        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(7);
        root2.right = new TreeNode(2);

        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(4);

        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        root2.left.left = new TreeNode(7);
        root2.left.right = new TreeNode(6);

        System.out.println(isMirror(root1,root2));
    }
}

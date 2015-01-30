package trees;

/**
 * Created by manish on 1/15/15.
 */
public class AreStructureSame {
    public static boolean areSameTrees(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        else return ((root1.val == root2.val) && areSameTrees(root1.left, root2.left) && areSameTrees(root1.right, root2.right));
    }

    public static void main(String args[]) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        root1.left.left.left = new TreeNode(8);
        root1.left.left.right = new TreeNode(9);

        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        root2.left.left.left = new TreeNode(8);
        root2.left.left.right = new TreeNode(9);

        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        System.out.println(areSameTrees(root1,root2));
    }
}

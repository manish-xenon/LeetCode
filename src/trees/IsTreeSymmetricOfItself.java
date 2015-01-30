package trees;

/**
 * Created by manish on 1/25/15.
 */
public class IsTreeSymmetricOfItself {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, makeRoot(root));
    }

    private static void makeMirrorOfTree(TreeNode root){
        if(root == null) return;
        TreeNode temp;

        if(root.left != null) makeMirrorOfTree(root.left);
        if(root.right != null) makeMirrorOfTree(root.right);

        //Swap left and right pointers to make mirror tree
        temp = root.left;
        root.left = root.right;
        root.right = temp;

    }

    private static TreeNode makeRoot(TreeNode root){
        makeMirrorOfTree(root);
        return root;
    }

    private static boolean isSymmetric(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if((root1 != null && root2 == null) || (root1 == null && root2 != null)) return false;
        else return root1.val == root2.val
                && isSymmetric(root1.left, root2.right)
                && isSymmetric(root1.right, root2.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println(isSymmetric(root));
    }

}

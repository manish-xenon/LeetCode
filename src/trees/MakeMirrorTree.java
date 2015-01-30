package trees;

/**
 * Created by manish on 1/25/15.
 */
public class MakeMirrorTree {
    public static void makeMirror(TreeNode root){
        if(root == null) return;
        TreeNode temp;

        if(root.left != null) makeMirror(root.left);
        if(root.right != null) makeMirror(root.right);

        //Swap left and right pointers to make mirror tree
        temp = root.left;
        root.left = root.right;
        root.right = temp;
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

        LevelTraversalEachLevel x = new LevelTraversalEachLevel();

        System.out.println(x.levelOrder(root));
        makeMirror(root);
        System.out.println(x.levelOrder(root));
    }
}

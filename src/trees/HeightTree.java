package trees;

/**
 * Created by manish on 1/14/15.
 */
public class HeightTree {
    public static int heightTree(TreeNode root){
        int left, right;
        if(root == null) return 0;
        else{
            left = heightTree(root.left);
            right = heightTree(root.right);
//            if(left > right)
//                return left + 1;
//            else
//                return right + 1;
            //Or could have been done like
            return Math.max(left, right) + 1;
        }
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
        int height = heightTree(root);
        System.out.println(height);
    }
}

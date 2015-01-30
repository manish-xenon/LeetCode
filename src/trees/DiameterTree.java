package trees;

/**
 * Created by manish on 1/24/15.
 */
public class DiameterTree {
//Diameter of tree
//Math.max((HeightLeft + HeightRight + 1), Math.max(DiameterLeft, DiameterRight))
    public static int diameter(TreeNode root){
        if(root == null) return 0;
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }
    private static int height(TreeNode root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(diameter(root));
    }
}

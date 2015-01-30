package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish on 1/24/15.
 */
public class Test {
    static int maxSum;
    public static int sum(TreeNode root){
        maxSum = (root == null)? 0 : root.val;
        findMax(root);
        return maxSum;
    }
    private static int findMax(TreeNode root){
        if(root == null) return 0;
        // Calculate leftMax and rightMax

        int leftMax = Math.max(findMax(root.left), 0);
        int rightMax = Math.max(findMax(root.right), 0);

        // Update max

        maxSum = Math.max(leftMax + rightMax + root.val, maxSum);

        // Return
        return root.val + Math.max(leftMax, rightMax);
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

        System.out.println(sum(root));
    }
}

package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish on 1/15/15.
 */

// This method is to substract the root value from the sum recursively
    // once you reach the leaf and if the remaining sum is equal to leaf value
    // then the given sum equals the root to leaf sum

public class RootToLeafActualHasSum2 {
    public static boolean hasPathSum(TreeNode root, int sum) {
        boolean result = false;
        if(root == null) return (sum == 0);
        if(root.left == null && root.right == null){
            result = (sum == root.val);
            return result;
        }
        else{
                result = hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
                return result;
        }
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        System.out.println(hasPathSum(root, 21));
    }
}

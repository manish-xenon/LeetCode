package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish on 1/15/15.
 */
public class RootToLeafActualHasSum {
    private static List<Integer> result;

    private static List<Integer> rootToLeafActualSum(TreeNode root) {
        result = new ArrayList<Integer>();
        rootToLeafActualSum(root, 0);
        return result;
    }

    private static void rootToLeafActualSum(TreeNode root, int num) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            result.add(num + root.val);
        } else {
            if (root.left != null)
                rootToLeafActualSum(root.left, num + root.val);
            if (root.right != null)
                rootToLeafActualSum(root.right, num + root.val);
        }
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        return rootToLeafActualSum(root).contains(sum);
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

        System.out.println(hasPathSum(root, 15));
    }
}

package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish on 1/15/15.
 */
public class RootToLeafActualSum {

    private static List<Integer> result;

    public static List<Integer> sumPaths(TreeNode root) {
        result = new ArrayList<Integer>();
        sumPaths(root, 0);
        return result;
    }

    private static void sumPaths(TreeNode root, int num) {
        if (root == null) return;

        if (root.left == null && root.right == null) {//Leaf node
            result.add(num + root.val); // Actual sum
        } else {
            if (root.left != null)
                sumPaths(root.left, num + root.val);
            if (root.right != null)
                sumPaths(root.right, num + root.val);
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

        System.out.println(sumPaths(root));
    }
}

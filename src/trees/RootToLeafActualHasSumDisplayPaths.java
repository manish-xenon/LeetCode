package trees;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish on 1/15/15.
 */
public class RootToLeafActualHasSumDisplayPaths {
    private static List<List<Integer>> result;

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<List<Integer>>();
        pathSum(root, null, sum);
        return result;
    }
    private static void pathSum(TreeNode root, List<Integer> path, int sum) {
        if (root == null) return;
        if (path == null) path = new ArrayList<Integer>();
        List<Integer> new_path = new ArrayList<Integer>();
        for (Integer i : path) new_path.add(i);
        new_path.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                result.add(new_path);
                return;
            } else {path = null; new_path = null; return;}
        }
        if (root.left != null) pathSum(root.left, new_path, sum - root.val);
        if (root.right != null) pathSum(root.right, new_path, sum - root.val);
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(pathSum(root, 15));
    }
}

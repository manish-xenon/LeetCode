package trees;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish on 1/16/15.
 */
public class RootToLeafActualHasSumDisplayPaths2 {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        pathSum(root, sum, result, new ArrayList<Integer>());
        return result;
    }

    private static void pathSum(TreeNode root, int sum, List<List<Integer>> res, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        sum -= root.val;
        if(root.left == null && root.right == null && sum == 0){
            res.add(new ArrayList<Integer>(list));
        }
        else{
            pathSum(root.left, sum, res, list);
            pathSum(root.right, sum, res, list);
        }
        list.remove(list.size() - 1);// for backtracking
        // As you have already reached the leaf and sum is not equal to zero
        // so you need to back track and check the right subtree from the parent
        // of the leaf node
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

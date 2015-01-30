package trees;

/**
 * Created by manish on 1/16/15.
 */

// Hard Question and good one
public class MaxPathSum {
    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = (root == null)? 0 : root.val;
        findMax(root);
        return maxSum;
    }

    private int findMax(TreeNode root){
        if(root == null) return 0;

        //recursively get sum of left and right path
        int left = Math.max(findMax(root.left), 0);
        int right = Math.max(findMax(root.right), 0);

        //update max
        maxSum = Math.max((left + right + root.val), maxSum);

        // return sum of largest path of current node
        return root.val + Math.max(left,right);
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
        MaxPathSum m = new MaxPathSum();

        System.out.println(m.maxPathSum(root));
    }
}

package trees;

/**
 * Created by manish on 1/14/15.
 */
public class RootToLeafPathsSumMethod2 {
    public static int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        return helper(root, 0, 0);
        }
    private static int helper(TreeNode current, int value, int sum){
        if(current == null) return sum;
        value = value*10 + current.val;
        if(current.left == null && current.right == null){// reached leaf node
            sum = sum + value;
            return sum;
        }
        // left and right subtree
        sum = helper(current.left, value, sum) + helper(current.right, value, sum);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        System.out.println(sumNumbers(root));
    }
}

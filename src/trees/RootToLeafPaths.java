package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish on 1/24/15.
 */
public class RootToLeafPaths {
    private static List<Integer> result;
    public static List<Integer> rootToLeafPaths(TreeNode root){
        result = new ArrayList<Integer>();
        rootToLeafPaths(root, 0);
        return result;
    }

    private static void rootToLeafPaths(TreeNode root, int num){
        if(root == null) return;
        //base case when reach leaf
        if(root.left == null && root.right == null){
            result.add(10*num + root.val);
        }
        else{
            if(root.left != null)
                rootToLeafPaths(root.left, 10*num + root.val);
            if(root.right != null)
                rootToLeafPaths(root.right, 10*num + root.val);
        }
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
        System.out.println(rootToLeafPaths(root));
    }

}

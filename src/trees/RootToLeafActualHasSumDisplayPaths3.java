package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish on 1/15/15.
 */
public class RootToLeafActualHasSumDisplayPaths3 {
    private static List<Integer> s;
    private static List<Integer> p;
    private static List<Integer> finalPath;
    private static List<List<Integer>> result;

    private static void sumNumber(TreeNode root, int num) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            s.add(num + root.val);

        } else {
            if (root.left != null)
                sumNumber(root.left, num + root.val);

            if (root.right != null)
                sumNumber(root.right, num + root.val);
        }
    }

    private static void pathConcatenation(TreeNode root, int num) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            p.add(num*10 + root.val);

        } else {
            if (root.left != null)
                pathConcatenation(root.left, num*10 + root.val);

            if (root.right != null)
                pathConcatenation(root.right, num*10 + root.val);
        }
    }

    private static List<Integer> sum(TreeNode root) {
        s = new ArrayList<Integer>();
        sumNumber(root, 0);
        return s;
    }

    private static List<Integer> path(TreeNode root) {
        p = new ArrayList<Integer>();
        pathConcatenation(root,0);
        return p;
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        return sum(root).contains(sum);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<List<Integer>>();
        finalPath = new ArrayList<Integer>();

        if(hasPathSum(root, sum)){
            for(int i = 0; i < s.size(); i++){
                if(s.get(i) == sum){
                    finalPath.add(path(root).get(i));
                    result.add(finalPath);
                    finalPath = new ArrayList<Integer>();
                }
            }
        }
        return result;
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

package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by manish on 1/14/15.
 */

// Level Order approach is better because consider that
    // there are a million nodes on left subtree of root
    // and only one node in the right subtree, then
    // with recursive approach the entire tree will
    // be scanned. Therefore using the level order traversal
    // we only need to traverse level by level and stop when at any level
    // the node's left and right child is null

public class MinimumDepthTreeLevelOrder {
    public static int minimumDepthTreeLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int level = 0;
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        List<Integer> list = new ArrayList<Integer>();
        TreeNode previous = null;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) {
                result.add(list);
                list = new ArrayList<Integer>();
                level++;
                if (!queue.isEmpty())
                    queue.add(null);
                if(previous.left == null && previous.right == null)
                    break;
            } else {
                list.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
                previous = current;
            }
        }
        //System.out.println(result);
        return level;
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

        System.out.println(minimumDepthTreeLevelOrder(root));

    }
}


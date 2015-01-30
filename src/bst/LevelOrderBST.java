package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by manish on 1/24/15.
 */
public class LevelOrderBST {
    public static List<List<Integer>> levelOrder(BinaryTreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) return result;

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        queue.add(null);

        List<Integer> tempList = new ArrayList<Integer>();
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();

            if (current == null) {
                result.add(tempList);
                tempList = new ArrayList<Integer>();
                if (!queue.isEmpty())
                    queue.add(null);
            } else {
                tempList.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        return result;
    }
}

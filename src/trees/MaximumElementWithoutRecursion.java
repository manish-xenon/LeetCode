package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manish on 1/14/15.
 */
public class MaximumElementWithoutRecursion {
    public static int findMaximumElementWithoutRecursion(TreeNode root) {
        int maxVal = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current = root;
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.remove();
            if (current.val > maxVal) maxVal = current.val;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return maxVal;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(8);
        binaryTree.addNode(2);
        binaryTree.addNode(3);
        binaryTree.addNode(4);
        binaryTree.addNode(500);
        binaryTree.addNode(600);
        binaryTree.addNode(602);
        binaryTree.addNode(1);

        System.out.println(findMaximumElementWithoutRecursion(binaryTree.root));
    }
}

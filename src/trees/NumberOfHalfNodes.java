package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manish on 1/24/15.
 */
public class NumberOfHalfNodes {
    public static int numberOfHalfNodes(TreeNode root){
        int count = 0;
        if(root == null) return count;
        TreeNode current = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(current);

        while(!queue.isEmpty()){
            current = queue.poll();
            if((current.left != null && current.right == null) ||
                    (current.left == null && current.right != null)){
                // XOR Operation to find the half nodes
                count++;
            }
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(10);

        System.out.println(numberOfHalfNodes(root));
    }
}

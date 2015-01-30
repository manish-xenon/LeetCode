package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by manish on 1/14/15.
 */
public class LevelTraversalEachLevel {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);

        List<Integer> tempList = new ArrayList<Integer>();
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

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

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(5);
        binaryTree.addNode(100);
        binaryTree.addNode(15);
        binaryTree.addNode(200);
        binaryTree.addNode(250);
        binaryTree.addNode(30);
        binaryTree.addNode(350);
        binaryTree.addNode(400);
        LevelTraversalEachLevel s = new LevelTraversalEachLevel();
        System.out.println(s.levelOrder(binaryTree.root));

//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(3);
//        root.right.right = new TreeNode(10);
//        System.out.println(s.levelOrder(root));
    }
}

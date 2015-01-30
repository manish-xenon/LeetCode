package trees;

import java.util.*;

/**
 * Created by manish on 1/14/15.
 */
public class LevelTraversalEachLevelBottomUp {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<List<Integer>> stack = new Stack<List<Integer>>();

        if (root == null) return result;

        queue.add(root);
        queue.add(null);

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

        for(int i=0; i < result.size(); i++){
            stack.push(result.get(i));
        }

        while(!stack.empty()){
            finalResult.add(stack.pop());
        }

        return finalResult;
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
        LevelTraversalEachLevelBottomUp s = new LevelTraversalEachLevelBottomUp();
        System.out.println(s.levelOrderBottom(binaryTree.root));

//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(3);
//        root.right.right = new TreeNode(10);
//        System.out.println(s.levelOrder(root));
    }
}

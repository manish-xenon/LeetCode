package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manish on 1/14/15.
 */
public class SizeOfBinaryTreeWithoutRecursion {
    public static int sizeOfTreeWithoutRecursion(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current;
        int counter = 0;
        if(root == null) return counter;
        queue.add(root);
        while(!queue.isEmpty()){
            current = queue.poll();
            counter++;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return counter;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(8);
        binaryTree.addNode(2);
        binaryTree.addNode(3);
        binaryTree.addNode(4);
        binaryTree.addNode(500);
        binaryTree.addNode(600);
        binaryTree.addNode(601);
        binaryTree.addNode(1);
        binaryTree.addNode(12);

        System.out.println(sizeOfTreeWithoutRecursion(binaryTree.root));
    }
}

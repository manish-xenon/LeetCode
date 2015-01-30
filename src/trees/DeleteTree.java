package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manish on 1/14/15.
 */
public class DeleteTree {
    public static void deleteTree(TreeNode root) {
        if (root == null) return;
        if (root.left != null) deleteTree(root.left);
        if (root.right != null) deleteTree(root.right);
        root = null;
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
        System.out.println(SizeOfBinaryTree.sizeOfTree(binaryTree.root));
        deleteTree(binaryTree.root);
        System.out.println(SizeOfBinaryTree.sizeOfTree(binaryTree.root));

    }
}

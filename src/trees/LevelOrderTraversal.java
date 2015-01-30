package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manish on 1/14/15.
 */

//printLevelorder(tree)
//        1) Create an empty queue q
//        2) temp_node = root /*start from root*/
//        3) Loop while temp_node is not NULL
//        a) print temp_node->data.
//        b) Enqueue temp_node’s children (first left then right children) to q
//        c) Dequeue a node from q and assign it’s value to temp_node

public class LevelOrderTraversal {
    public static void levelOrderTraversalNodeDisplay(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current = root;
        while(current != null){
            current.displayNodeData();
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
            if(queue.isEmpty()) break;
            current = queue.remove();
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(8);
        binaryTree.addNode(2);
        binaryTree.addNode(3);
        binaryTree.addNode(4);
        binaryTree.addNode(5);
        binaryTree.addNode(6);
        binaryTree.addNode(7);
        binaryTree.addNode(1);

        levelOrderTraversalNodeDisplay(binaryTree.root);
    }

}

package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manish on 1/14/15.
 */
public class SearchElementWithoutRecursion {
    public static boolean searchElementWithoutRecursion(TreeNode root, int data){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current = root;
        boolean temp = false;
        while(current != null){
            if(current.val == data){
                temp = true;
                break;
            }
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
            current = queue.poll();
        }
        return temp;
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

        System.out.println(searchElementWithoutRecursion(binaryTree.root, 501));
    }
}

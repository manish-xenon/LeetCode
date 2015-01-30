package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manish on 1/14/15.
 */
public class HeightTreeWithoutRecursion {
    public static int heightTreeWithoutRecursion(TreeNode root){
        int level = 0;
        if(root == null) return level;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current == null){
                level++;
                if(!queue.isEmpty()) queue.add(null);
            }
            else
            {
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
        return level;
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
        int height = heightTreeWithoutRecursion(binaryTree.root);
        System.out.println(height);
    }
}

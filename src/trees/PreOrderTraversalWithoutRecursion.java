package trees;

import java.util.Stack;

/**
 * Created by manish on 1/13/15.
 */
public class PreOrderTraversalWithoutRecursion {
    public static void preOrderTraversalWithoutRecursion(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(true){
            while(root != null){
                stack.push(root);
                root.displayNodeData();
                root = root.left;
            }
            if(stack.empty())
                break;

            root = stack.pop();
            root = root.right;
        }
    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(45);
        binaryTree.addNode(55);
        binaryTree.addNode(25);
        binaryTree.addNode(85);
        binaryTree.addNode(65);
        binaryTree.addNode(35);
        binaryTree.addNode(95);
        binaryTree.addNode(15);
        binaryTree.addNode(5);
        binaryTree.addNode(75);

        preOrderTraversalWithoutRecursion(binaryTree.root);

    }
}

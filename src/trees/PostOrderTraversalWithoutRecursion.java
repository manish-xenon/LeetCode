package trees;

import java.util.Stack;

/**
 * Created by manish on 1/13/15.
 */
// This uses 2 Stacks
    // Idea
    // PostOrder = Reverse of (Data Right Left)
    // Where (Data Right Left) is a Pre Order with right node first.

public class PostOrderTraversalWithoutRecursion {
    public static void postOrderTraversalWithoutRecursion(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> stackFinal = new Stack<TreeNode>();

        StringBuilder stringBuilder = new StringBuilder();
        String FinalString = "";


        while(true){
            while(root != null){
                stack.push(root);
                stackFinal.push(root); // instead of printing, push to second stack
                root = root.right;// instead of left child, go to right
                // as it is Data Right Left not Data Left Right
            }
            if(stack.empty())
                break;

            root = stack.pop();
            root = root.left;
        }
        while(!stackFinal.empty()){
            FinalString = (stringBuilder.append(stackFinal.pop())).toString();
        }
        System.out.println(FinalString);
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

        postOrderTraversalWithoutRecursion(binaryTree.root);
    }
}

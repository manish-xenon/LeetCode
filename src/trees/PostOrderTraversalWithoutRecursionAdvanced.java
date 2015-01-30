package trees;

import java.util.Stack;

/**
 * Created by manish on 1/13/15.
 */
// USING SINGLE STACK
//        1.1 Create an empty stack
//        2.1 Do following while root is not NULL
//        a) Push root's right child and then root to stack.
//        b) Set root as root's left child.
//        2.2 Pop an item from stack and set it as root.
//        a) If the popped item has a right child and the right child
//        is at top of stack, then remove the right child from stack,
//        push the root back and set root as root's right child.
//        b) Else print root's data and set root as NULL.
//        2.3 Repeat steps 2.1 and 2.2 while stack is not empty.

public class PostOrderTraversalWithoutRecursionAdvanced {
    public static void postOrderTraversalWithoutRecursionUsingSingleStack(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp;

        if(root == null) return;

        do {
            while (root != null) {
                if (root.right != null) stack.push(root.right);
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            if(stack.empty()){
                root.displayNodeData();
                break;
            }

            if (root.right != null && root.right == stack.peek()) {
                temp = stack.pop();
                stack.push(root);
                root = temp;
            } else {
                root.displayNodeData();
                root = null;
            }
        } while (!stack.empty());
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

        postOrderTraversalWithoutRecursionUsingSingleStack(binaryTree.root);
    }
}

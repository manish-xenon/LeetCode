package trees;
import java.util.Stack;


/**
 * Created by manish on 1/13/15.
 */
public class InOrderTraversalWithoutRecursion {
    public static void inOrderTraversalWithoutRecursion(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(true){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            if(stack.empty()){
                break;
            }
            root = stack.pop();
            root.displayNodeData();
            root = root.right;
        }
        return;
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

        inOrderTraversalWithoutRecursion(binaryTree.root);
    }
}

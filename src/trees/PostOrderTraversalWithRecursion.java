package trees;

/**
 * Created by manish on 1/13/15.
 */
public class PostOrderTraversalWithRecursion {
    public static void postOrderTraversalWithRecursion(TreeNode root){
        if(root!=null){
            postOrderTraversalWithRecursion(root.left);
            postOrderTraversalWithRecursion(root.right);
            root.displayNodeData();
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

        postOrderTraversalWithRecursion(binaryTree.root);
    }
}

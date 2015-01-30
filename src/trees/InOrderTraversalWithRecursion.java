package trees;

/**
 * Created by manish on 1/13/15.
 */
public class InOrderTraversalWithRecursion {
    public static void inOrderTraversalWithRecursion(TreeNode root){
        if(root != null){
            inOrderTraversalWithRecursion(root.left);
            root.displayNodeData();
            inOrderTraversalWithRecursion(root.right);
        }
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

        inOrderTraversalWithRecursion(binaryTree.root);
    }
}

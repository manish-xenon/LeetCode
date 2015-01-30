package trees;

/**
 * Created by manish on 1/14/15.
 */
public class SizeOfBinaryTree {
    public static int sizeOfTree(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            return (sizeOfTree(root.left) + 1 + sizeOfTree(root.right));
        }
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

        System.out.println(sizeOfTree(binaryTree.root));
    }
}

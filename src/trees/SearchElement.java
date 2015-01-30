package trees;

/**
 * Created by manish on 1/14/15.
 */
public class SearchElement {
    public static boolean searchElement(TreeNode root, int data){
        boolean temp = false;
        if (root == null) return false;
        else{
            if(data == root.val)
                return true;
            else{
                if(searchElement(root.left, data))
                    return true;
                else
                    return searchElement(root.right, data);
                }
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

        System.out.println(searchElement(binaryTree.root, 500));
    }
}

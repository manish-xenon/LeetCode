package trees;

/**
 * Created by manish on 1/14/15.
 */
public class MaximumElement {
    public static int findMaximumElement(TreeNode root){
        int rootVal, leftVal, rightVal, maxVal = 0;
        if(root != null){
            rootVal = root.val;
            leftVal = findMaximumElement(root.left);
            rightVal = findMaximumElement(root.right);
            if(leftVal > rightVal) maxVal = leftVal;
            else maxVal = rightVal;
            if(rootVal > maxVal) maxVal = rootVal;
        }
        return maxVal;
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

        System.out.println(findMaximumElement(binaryTree.root));
    }
}

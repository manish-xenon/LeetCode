package bst;

/**
 * Created by manish on 1/13/15.
 */
public class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int x) {
        val = x;
    }
    public String toString(){
        return val + "=>";
    }
    public void displayNodeData(){
        System.out.print(this.val + "=>");
    }
}

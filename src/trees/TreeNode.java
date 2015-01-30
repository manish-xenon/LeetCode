package trees;

/**
 * Created by manish on 1/13/15.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
    public String toString(){
        return val + "=>";
    }
    public void displayNodeData(){
        System.out.print(this.val + "=>");
    }
}

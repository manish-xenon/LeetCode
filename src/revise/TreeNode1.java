package revise;

/**
 * Created by manish on 1/13/15.
 */
public class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int x) {
        val = x;
    }
    public String toString(){
        return val + "=>";
    }
    public void displayNodeData(){
        System.out.print(this.val + "=>");
    }
}

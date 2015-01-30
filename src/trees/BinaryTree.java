package trees;

/**
 * Created by manish on 1/13/15.
 */
public class BinaryTree {
    TreeNode root;

    BinaryTree(){
        root = null;
    }

    public void addNode(int val){
        TreeNode treeNode = new TreeNode(val);

        if(root == null){
            root = treeNode;
        }
        else{
            TreeNode current = root;
            TreeNode parent;

            while(true){
                parent = current;
                if(val < current.val){
                    current = current.left;
                    if(current == null){
                        parent.left = treeNode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = treeNode;
                        return;
                    }
                }

            }
        }
    }

}

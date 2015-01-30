package trees;

/**
 * Created by manish on 1/26/15.
 */
public class ConstructTreeFromInorderAndPostorder {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int inLength = inorder.length;
        int postLength = postorder.length;
        return buildTree(inorder, 0, inLength-1, postorder, 0, postLength-1);
    }

    private static TreeNode buildTree(int[] in, int inStart, int inEnd, int[] post, int postStart, int postEnd){
        // To stop recurses infinitely and to stop that we add the following case
        if(inStart > inEnd) return null;
        if(postEnd < postStart) return null;
        int rootValue = post[postEnd];
        int rootIndex = 0;
        for(int i=inStart; i <= inEnd; i++){
            if(in[i] == rootValue){
                rootIndex = i;
                break;
            }
        }
        // find out the distribution of left and right subtree
        int len = rootIndex - inStart;
        // make root node
        TreeNode root = new TreeNode(rootValue);
        // Recursively make left and right subtree

        root.left = buildTree(in, inStart, rootIndex-1, post, postStart, postEnd-len-1);
        root.right = buildTree(in, rootIndex + 1, inEnd, post, postEnd-len, postEnd-1);

        return root;
    }

    public static void main(String[] args) {
//        int[] inOrder = {10,30,40,50,60,70,90};
//        int[] postOrder = {10,40,30,60,90,70,50};

        int[] inOrder = {2, 1};
        int[] postOrder = {2, 1};
        TreeNode root = buildTree(inOrder, postOrder);
        LevelTraversalEachLevel level = new LevelTraversalEachLevel();
        System.out.println(level.levelOrder(root));
    }
}

package trees;

/**
 * Created by manish on 1/25/15.
 */
public class ConstructTreeFromInorderAndPreorder {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLength = preorder.length;
        int inLength = inorder.length;
        return buildTree(preorder, 0, preLength-1, inorder, 0, inLength-1);
    }

    private static TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
        if(inStart > inEnd) return null;
        int rootValue = pre[preStart];
        int rootIndex = 0;
        for(int i=inStart; i <= inEnd; i++){
            if(in[i] == rootValue){
                rootIndex = i;
                break;
            }
        }
        int len = rootIndex - inStart;
        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree(pre, preStart+1, preStart+len, in, inStart, rootIndex-1);
        root.right = buildTree(pre, preStart+1+len, preEnd, in, rootIndex+1, inEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {10,30,40,50,60,70,90};
        int[] preorder = {50,30,10,40,70,60,90};
        TreeNode root = buildTree(preorder, inorder);
        LevelTraversalEachLevel level = new LevelTraversalEachLevel();
        System.out.println(level.levelOrder(root));
    }
}

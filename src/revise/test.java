package revise;
import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by manish on 1/23/15.
 */
public class test {
    public static List<List<Integer>> levelTraverse(TreeNode1 root){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode1> queue = new LinkedList<TreeNode1>();
        queue.add(root);
        queue.add(null);
        List<Integer> tempList = new ArrayList<Integer>();
        TreeNode1 current;
        while(!queue.isEmpty()){
            current = queue.remove();
            if(current == null){
                result.add(tempList);
                tempList = new ArrayList<Integer>();
                if(!queue.isEmpty())
                    queue.add(null);
            }
            else{
                tempList.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);
        root.right.left = new TreeNode1(6);
        root.right.right = new TreeNode1(7);
        System.out.println(levelTraverse(root));
    }
}

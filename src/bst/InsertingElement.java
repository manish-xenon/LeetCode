package bst;

import trees.LevelTraversalEachLevel;
import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by manish on 1/24/15.
 */
public class InsertingElement {
    public static BinaryTreeNode insertElement(BinaryTreeNode root, int data){

        if(root == null){
            root = new BinaryTreeNode(data);
            root.left = null;
            root.right = null;
            return root;
        }
        else{
            if(data < root.val){
                root.left = insertElement(root.left, data);
            }
            else root.right = insertElement(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(7);
        root.left = new BinaryTreeNode(5);
        root.left.right = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(4);
        root.right = new BinaryTreeNode(9);
        insertElement(root, 1);
        System.out.println(LevelOrderBST.levelOrder(root));
    }
}

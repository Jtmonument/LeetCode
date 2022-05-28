package binarytree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    private static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root != null) {
            list.add(root.val);
            if(root.left != null) {
                list.addAll(preorderTraversal(root.left));
            }
            if(root.right != null) {
                list.addAll(preorderTraversal(root.right));
            }
        }
        return list;
    }
}

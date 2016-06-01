package MaximumDepthOfBinaryTree;

/**
 * Created by dingpeng on 16/6/1.
 * <p>
 * Definition for a binary tree node.
 */

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode node, int depth) {
        if (node == null)
            return depth;
        return Math.max(maxDepth(node.left, depth + 1), maxDepth(node.right, depth + 1));
    }
}

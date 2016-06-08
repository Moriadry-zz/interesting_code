package MaximumDepthOfBinaryTree;

/**
 * Created by dingpeng on 16/6/1.
 */
public class SmartSolution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //still to slow.. how do this without Recursion
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        if (l > r)
            return l + 1;
        return r + 1;

    }
}

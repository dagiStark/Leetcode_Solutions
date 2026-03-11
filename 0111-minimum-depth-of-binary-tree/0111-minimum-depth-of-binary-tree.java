class Solution {
    public int minDepth(TreeNode root) {
        // Base case: empty node → depth = 0
        if (root == null) return 0;

        // If the node has no left child, we must go right
        if (root.left == null) return minDepth(root.right) + 1;

        // If the node has no right child, we must go left
        if (root.right == null) return minDepth(root.left) + 1;

        // If both children exist, take the smaller one
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
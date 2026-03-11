class Solution {

    int diameter = 0; // global variable to track maximum diameter

    public int diameterOfBinaryTree(TreeNode root) {
        // The recursive function returns height
        height(root);
        // diameter holds the maximum diameter found
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);   // height of left subtree
        int right = height(node.right); // height of right subtree

        // the path through this node (edges) = leftHeight + rightHeight
        diameter = Math.max(diameter, left + right);

        // return height for parent node calculation
        return 1 + Math.max(left, right);
    }
}
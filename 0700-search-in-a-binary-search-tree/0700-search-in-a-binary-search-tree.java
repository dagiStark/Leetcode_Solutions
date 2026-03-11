class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;       // base case: not found
        if (root.val == val) return root;    // found the node
        
        if (val < root.val) {
            return searchBST(root.left, val);   // go left
        } else {
            return searchBST(root.right, val);  // go right
        }
    }
}
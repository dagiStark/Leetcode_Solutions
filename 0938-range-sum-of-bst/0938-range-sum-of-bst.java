/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        // If there is no node, return 0
    if (root == null) {
        return 0;
    }

    int sum = 0;

    // If the current node's value is in the range,
    // add it to the sum
    if (root.val >= low && root.val <= high) {
        sum += root.val;
    }

    // Add the sum from the left side of the tree
    sum += rangeSumBST(root.left, low, high);

    // Add the sum from the right side of the tree
    sum += rangeSumBST(root.right, low, high);

    return sum;
    }
}
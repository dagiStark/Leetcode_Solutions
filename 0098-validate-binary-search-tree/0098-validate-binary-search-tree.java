import java.util.Stack;

class Solution {

    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode previousNode = null;

        while (current != null || !stack.isEmpty()) {

            // Step 1: Go all the way left
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Step 2: Visit node
            current = stack.pop();

            // Step 3: Check BST condition
            if (previousNode != null && current.val <= previousNode.val) {
                return false;
            }

            // Step 4: Update previous
            previousNode = current;

            // Step 5: Go right
            current = current.right;
        }

        return true;
    }
}
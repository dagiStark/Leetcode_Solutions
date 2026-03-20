class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        helper(root, "", result);
        return result;
    }

    private void helper(TreeNode node, String path, List<String> result) {
        if (node == null) return;

        // build path
        if (path.isEmpty()) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

        // if leaf → add to result
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        // go left and right
        helper(node.left, path, result);
        helper(node.right, path, result);
    }
}
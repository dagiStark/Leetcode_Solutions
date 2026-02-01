import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        // Split path by '/'
        String[] parts = path.split("/");
        
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // Ignore empty and current directory
                continue;
            } else if (part.equals("..")) {
                // Go to parent directory if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Valid directory name (including '...', '....')
                stack.push(part);
            }
        }
        
        // Build the canonical path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        
        // If stack is empty, return root
        return result.length() == 0 ? "/" : result.toString();
    }
}

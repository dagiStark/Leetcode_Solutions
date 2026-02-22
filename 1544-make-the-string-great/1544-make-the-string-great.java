public class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            int len = stack.length();
            
            if (len > 0) {
                char top = stack.charAt(len - 1);
                
                if (Character.toLowerCase(top) == Character.toLowerCase(ch)
                    && top != ch) {
                    stack.deleteCharAt(len - 1);
                    continue;
                }
            }
            
            stack.append(ch);
        }
        
        return stack.toString();
    }
}
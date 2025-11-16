class Solution {
     public int maxDepth(String s) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (c == ')') {
                count--;
            }
        }

        return maxCount;
    }
}
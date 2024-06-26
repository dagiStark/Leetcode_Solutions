class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder string = new StringBuilder();
        int i = 0;
        int j =0;
        while(i < word1.length() && j < word2.length()){
            string.append(word1.charAt(i));
            string.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < word1.length()){
            string.append(word1.charAt(i));
            i++;
        }
        while(j < word2.length()){
            string.append(word2.charAt(j));
            j++;
        }
        return string.toString();
    }
}
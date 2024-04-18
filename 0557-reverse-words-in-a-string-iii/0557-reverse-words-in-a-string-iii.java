class Solution {
    public String reverseWords(String s) {
        String n = "";
        String[] words = s.split(" ");
        for(String i : words){
            n = n + new StringBuilder(i + " ").reverse().toString();
        }
        return n.trim();
        
    }
}
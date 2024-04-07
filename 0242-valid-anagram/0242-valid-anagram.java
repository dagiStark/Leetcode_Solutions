class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        List<Character> ans = new ArrayList<>();
        for(int i =0; i< t.length();i++) ans.add(t.charAt(i));
        for(int i =0; i< s.length(); i++){
            if(ans.contains(s.charAt(i))) ans.remove(ans.indexOf(s.charAt(i)));
        }
        return ans.size() == 0;
    }
}
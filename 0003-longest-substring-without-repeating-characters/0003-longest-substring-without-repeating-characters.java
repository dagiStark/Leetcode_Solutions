class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int temp = 0;
        Stack<Character> ans = new Stack<>();
        int i = 0;
        while(i < s.length()){
            for(int j = i; j< s.length() ; j++){
                if(ans.contains(s.charAt(j))){
                    temp = ans.size();
                    ans.clear();
                    break;
                }else{
                    ans.push(s.charAt(j));
                }
            }
            i++;
            if(temp > count) count = temp;
        }
        if(ans.size() > count) return ans.size();
        else return count;
    }
}
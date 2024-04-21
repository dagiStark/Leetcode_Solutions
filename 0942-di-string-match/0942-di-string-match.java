class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n+1];
        int min = 0;
        int max = n ;
        for(int i = 0;i< s.length(); i++){
            if(s.charAt(i) == 'I'){
                ans[i] = min;
                min += 1;
            }else{
                ans[i] = max;
                max -= 1;
            }
        }
        if(s.charAt(s.length() -1) == 'I'){
            ans[n] = ans[n - 1] + 1;
        }else{
            ans[n] = ans[n-1] -1;
        }
        return ans;
    }
}
class Solution {
    public int maxDepth(String s) {
        int maxD = 0; 
        int currD = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                currD++;
                maxD = Math.max(currD, maxD);
            }else if(ch == ')'){
                currD--;
            }
        }

        return maxD;
    }
}
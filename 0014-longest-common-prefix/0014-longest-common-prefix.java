class Solution {
    static String shortest(String[] staff){
        String checker = staff[0];
        for(int i =1; i<staff.length;i++){
            if(checker.length()>staff[i].length()){
                checker = staff[i];
            }
        }
        return checker;
    }
    public String longestCommonPrefix(String[] strs) {
        String tester = shortest(strs);
        for(int i = 0;i<tester.length();i++){
            for(int j = 0;j<strs.length;j++){
                if(tester.charAt(i) != strs[j].charAt(i)){
                    return tester.substring(0, i);
                }
            }
        }
        return tester;
    }
}
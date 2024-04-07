class Solution {
    public int strStr(String haystack, String needle) {
        int temp = -1;
        if(haystack.length() <= needle.length()){
            if(haystack.equals(needle)){
                return 0;
            }else{
                return temp;
            }
        }
        for(int i = 0;i <= haystack.length() - needle.length();i++){
            String subStr = haystack.substring(i,i + needle.length());
            if(subStr.equals(needle)){
                temp = i;
                return temp;
            }
        }
        return temp;
    }
}
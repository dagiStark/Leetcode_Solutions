class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] charString = s.toCharArray();
        int i = 0;
        int j = s.length() -1;
        while(i < j){
            if(vowels.contains(Character.toString(charString[i]))){
                char temp = charString[i];
                while(!vowels.contains(Character.toString(charString[j]))) j--;
                if(j != i){
                    charString[i] = charString[j];
                    charString[j] = temp;
                    j--;
                }
            }
            i++;
        }
        return new String(charString);

    }
}
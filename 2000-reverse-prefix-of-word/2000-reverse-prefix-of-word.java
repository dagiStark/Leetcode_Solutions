class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(Character.toString(ch))) return word;
        char[] newWord = word.toCharArray();
        int j = word.indexOf(ch);
        int i = 0;
        while(i<j){
            char temp = newWord[i];
            newWord[i] = newWord[j];
            newWord[j] = temp;
            i++;
            j--;
        }
        return new String(newWord);
    }
}
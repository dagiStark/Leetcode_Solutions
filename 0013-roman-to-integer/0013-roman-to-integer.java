class Solution {
    static int value(char n){
    switch (n) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
    }
    return 0;
   }
    public int romanToInt(String s) {
        int sum =0;
        for(int i = 0; i<s.length();i++){
            if(i == s.length()-1){
                return (sum + value(s.charAt(i)));
            }
            if(value(s.charAt(i)) < value(s.charAt(i+1))){
                sum += (value(s.charAt(i+1)) - value(s.charAt(i)));
                i++;
            }else{
                sum += value(s.charAt(i));
            }
        }
        return sum;
        
    }
}
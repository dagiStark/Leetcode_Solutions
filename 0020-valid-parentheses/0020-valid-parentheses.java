class Solution {
    public boolean isValid(String brackets) {
         Stack<Character> para = new Stack<Character>();
      if(brackets.length() % 2 != 0){
          return false;
      }
      for(int i =0;i<brackets.length();i++){
         if(brackets.charAt(i) == '('){
            para.push('(');
         }else if(brackets.charAt(i) == '{'){
            para.push('{');
         }else if(brackets.charAt(i) == '['){
            para.push('[');
         }else if(brackets.charAt(i) == ')'){
            if(para.isEmpty()){
               return false;
            }else if(para.peek() != '('){
               return false;
            }else{
               para.pop();
            }
         }else if(brackets.charAt(i) == '}'){
            if(para.isEmpty()){
               return false;
            }else if(para.peek() != '{'){
               return false;
            }else{
               para.pop();
            }
         }else if(brackets.charAt(i) == ']'){
            if(para.isEmpty()){
               return false;
            }else if(para.peek() != '['){
               return false;
            }else{
               para.pop();
            }
         }
      }
      return para.isEmpty();

    }
}